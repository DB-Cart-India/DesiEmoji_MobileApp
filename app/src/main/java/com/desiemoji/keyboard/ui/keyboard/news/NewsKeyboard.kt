package com.desiemoji.keyboard.ui.keyboard.news

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_HEALTH
import com.frogobox.coreapi.news.NewsConstant.COUNTRY_ID
import com.frogobox.coreapi.news.NewsUrl
import com.frogobox.coreapi.news.model.Article
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.recycler.ext.injectorBinding
import com.desiemoji.keyboard.common.base.BaseKeyboard
import com.desiemoji.keyboard.databinding.ItemKeyboardNewsBinding
import com.desiemoji.keyboard.databinding.KeyboardListBinding
import com.frogobox.sdk.ext.gone
import com.frogobox.sdk.ext.visible


class NewsKeyboard(
    context: Context,
    attrs: AttributeSet?,
) : BaseKeyboard<KeyboardListBinding>(context, attrs) {

    override fun setupViewBinding(): KeyboardListBinding {
        return KeyboardListBinding.inflate(LayoutInflater.from(context), this, true)
    }

    override fun onCreate() {
        setupData()
        initView()
    }

    private fun initView() {
        binding?.apply {
            tvToolbarTitle.text = "News Api"
        }
    }

    private fun setupData() {
        val consumeNewsApi = ConsumeNewsApi(NewsUrl.API_KEY) // Your API_KEY
        consumeNewsApi.getTopHeadline( // Adding Base Parameter on main function
            null,
            null,
            CATEGORY_HEALTH,
            COUNTRY_ID,
            null,
            null,
            object : ConsumeApiResponse<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    // Your Ui or data
                    data.articles?.let { setupRv(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // Your failed to do
                }

                override fun onFinish() {
                    // Your finish to do
                }

                override fun onShowProgress() {
                    // Your Progress Show
                    binding?.progressBar?.visible()
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    binding?.progressBar?.gone()
                }

            })

    }

    private fun setupRv(data: List<Article>) {
        binding?.apply {

            val adapterCallback = object : IFrogoBindingAdapter<Article, ItemKeyboardNewsBinding> {
                override fun onItemClicked(
                    binding: ItemKeyboardNewsBinding,
                    data: Article,
                    position: Int,
                    notifyListener: FrogoRecyclerNotifyListener<Article>,
                ) {
                    // Your Clicked
                    Log.d("NewsKeyboard", "onItemClicked: ${data.title}")
                    Log.d("FrogoKeyboard", "currentInputConnection: $currentInputConnection")
                    val output = "${data.title}\n" +
                            "${data.author}\n" +
                            "\n" +
                            "${data.description}\n" +
                            "\n" +
                            "Sumber : ${data.url}" +
                            "\n" +
                            "Terima Kasih"
                    currentInputConnection?.commitText(output, 1)
                }

                override fun onItemLongClicked(
                    binding: ItemKeyboardNewsBinding,
                    data: Article,
                    position: Int,
                    notifyListener: FrogoRecyclerNotifyListener<Article>,
                ) {
                }

                override fun setViewBinding(parent: ViewGroup): ItemKeyboardNewsBinding {
                    return ItemKeyboardNewsBinding.inflate(LayoutInflater.from(context),
                        parent,
                        false)
                }

                override fun setupInitComponent(
                    binding: ItemKeyboardNewsBinding,
                    data: Article,
                    position: Int,
                    notifyListener: FrogoRecyclerNotifyListener<Article>,
                ) {
                    binding.apply {
                        tvItemKeyboardMain.text = data.title
                    }
                }
            }

            rvKeyboardMain.injectorBinding<Article, ItemKeyboardNewsBinding>()
                .addData(data)
                .createLayoutLinearVertical(false)
                .addCallback(adapterCallback)
                .build()
        }
    }

}