package com.desiemoji.keyboard.ui.keyboard.emoji.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.desiemoji.keyboard.R
import com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity
import com.desiemoji.keyboard.ui.keyboard.StickerSender
import com.desiemoji.keyboard.ui.keyboard.emoji.EmojiKeyboardRecyclerView

class CustomCategoryEmojiAdapter (
    var stickerSender: StickerSender,
    val context: Context,
    var items: List<CustomSubCategoryEntity>
    ) : RecyclerView.Adapter<CustomCategoryEmojiAdapter.ViewHolder>() {
    private val layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutId = R.layout.item_keyboard_category_recyclerview
        val view = layoutInflater.inflate(layoutId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bindView(item) { itemView ->
            setupEmoji(itemView, item)
        }
    }

    override fun getItemCount() = items.size

    private fun setupEmoji(view: View, emoji: CustomSubCategoryEntity) {
        val tvLabel= view.findViewById<TextView>(R.id.tv_label)
        val rvList= view.findViewById<EmojiKeyboardRecyclerView>(R.id.emojis_sublist)
        tvLabel.text=emoji.label
        rvList.apply {
            val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
            val emojiTopBarElevation =
                context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()

            layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
            adapter = CustomEmojiAdapter(stickerSender=stickerSender,context = context, items = emoji.data) {
            }

//            onScroll {
//                binding!!.emojiPaletteTopBar.elevation =
//                    if (it > 4) emojiTopBarElevation else 0f
//            }
        }

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(emoji: CustomSubCategoryEntity, callback: (itemView: View) -> Unit): View {
            return itemView.apply {

            }
        }
    }
}
