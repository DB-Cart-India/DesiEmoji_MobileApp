package com.desiemoji.keyboard.ui.keyboard.emoji

import android.content.Context
import android.util.Log
import com.desiemoji.keyboard.common.base.BaseViewModel
import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.category.CategoryEntity
import com.desiemoji.keyboard.data.local.db.AppDatabase
import com.desiemoji.keyboard.data.local.emoji.EmojiEntity
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity
import com.desiemoji.keyboard.repository.category.CategoryRepository
import com.desiemoji.keyboard.repository.category.CategoryRepositoryImpl
import com.desiemoji.keyboard.repository.emoji.EmojiRepository
import com.desiemoji.keyboard.repository.emoji.EmojiRepositoryImpl
import com.desiemoji.keyboard.repository.recentemoji.RecentEmojiRepository
import com.desiemoji.keyboard.repository.recentemoji.RecentEmojiRepositoryImpl
import com.desiemoji.keyboard.repository.subcategory.SubCategoryRepository
import com.desiemoji.keyboard.repository.subcategory.SubCategoryRepositoryImpl

class EmojiKeyboardViewModel (val context: Context) : BaseViewModel(){

    private fun getRepository() : RecentEmojiRepository {
        return RecentEmojiRepositoryImpl(AppDatabase.newInstance(context).recentEmojiDao())
    }

    private fun getCategoryRepository() : CategoryRepository {
        return CategoryRepositoryImpl(AppDatabase.newInstance(context).categoryDao())
    }

    private fun getSubCategoryRepository() : SubCategoryRepository {
        return SubCategoryRepositoryImpl(AppDatabase.newInstance(context).subCategoryDao())
    }

    private fun getEmojiRepository() : EmojiRepository {
        return EmojiRepositoryImpl(AppDatabase.newInstance(context).emojiDao())
    }

    fun getAllRecentEmoji(onSuccessData: (List<String>) -> Unit) {
        getRepository().getAllRecentEmojis(object : DataResponseCallback<List<String>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {}
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<String>) {
                onSuccessData(data)
            }
        })
    }

    fun insertRecentEmoji(code: String) {
        val data = RecentEmojiEntity(
            emojiCode = code,
        )
        getRepository().insertRecentEmoji(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }


    fun getAllCategoryList(onSuccessData: (List<CategoryEntity>) -> Unit) {
        getCategoryRepository().getAllCategory(object : DataResponseCallback<List<CategoryEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {

            }
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<CategoryEntity>) {
                onSuccessData(data)
            }
        })
    }

    fun getCategoryByCategoryId( categoryId:Long,onSuccessData: (CategoryEntity?) -> Unit) {
        getCategoryRepository().getCategoryByCategoryId(categoryId,object : DataResponseCallback<CategoryEntity> {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                Log.i("getCategoryByCategoryId","getCategoryByCategoryId onFailed.....")
                onSuccessData(null)
            }
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: CategoryEntity) {
                onSuccessData(data)
            }
        })
    }


    fun insertCategory(data: CategoryEntity) {

        getCategoryRepository().insertCategory(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }


    fun updateCategory(data: CategoryEntity) {

        getCategoryRepository().updateCategory(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }

    //------------------------------- Sub Category-----------------------------------------------

    fun getAllSubCategoryList(onSuccessData: (List<SubCategoryEntity>) -> Unit) {
        getSubCategoryRepository().getAllSubCategory(object : DataResponseCallback<List<SubCategoryEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {}
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<SubCategoryEntity>) {
                onSuccessData(data)
            }
        })
    }

    fun getSubCategoryByCategoryId(categoryId:Long,onSuccessData: (List<SubCategoryEntity>) -> Unit) {
        getSubCategoryRepository().getSubCategoryByCategoryId(categoryId,object : DataResponseCallback<List<SubCategoryEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {
            }
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<SubCategoryEntity>) {
                onSuccessData(data)
            }
        })
    }


    fun getSubCategoryBySubCategoryId( subCategoryId:Long,onSuccessData: (SubCategoryEntity?) -> Unit) {
        getSubCategoryRepository().getSubCategoryBySubCategoryId(subCategoryId,object : DataResponseCallback<SubCategoryEntity> {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                Log.i("getSubCategoryBy","getSubCategoryBySubCategoryId onFailed.....")
                onSuccessData(null)
            }
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: SubCategoryEntity) {
                onSuccessData(data)
            }
        })
    }


    fun insertSubCategory(data: SubCategoryEntity) {

        getSubCategoryRepository().insertSubCategory(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }


    fun updateSubCategory(data: SubCategoryEntity) {

        getSubCategoryRepository().updateSubCategory(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }


    //----------------------------------------------------------------------------------



    //------------------------------- Emoji -----------------------------------------------

    fun getEmojiByCategoryId(categoryId:Long,onSuccessData: (List<EmojiEntity>) -> Unit) {
        getEmojiRepository().getEmojiByCategoryId(categoryId,object : DataResponseCallback<List<EmojiEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {}
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<EmojiEntity>) {
                onSuccessData(data)
            }
        })
    }

    fun getEmojiBySubCategoryId(subCategoryId:Long,onSuccessData: (List<EmojiEntity>) -> Unit) {
        getEmojiRepository().getEmojiBySubCategoryId(subCategoryId,object : DataResponseCallback<List<EmojiEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {}
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<EmojiEntity>) {
                onSuccessData(data)
            }
        })
    }

    fun getEmojiBySearch(searchText:String,onSuccessData: (List<EmojiEntity>) -> Unit) {
        getEmojiRepository().getEmojiBySearch(searchText,object : DataResponseCallback<List<EmojiEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {}
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<EmojiEntity>) {
                onSuccessData(data)
            }
        })
    }

    fun getEmojiByEmojiId( emojiId:Long,onSuccessData: (EmojiEntity?) -> Unit) {
        getEmojiRepository().getEmojiByEmojiId(emojiId,object : DataResponseCallback<EmojiEntity> {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                Log.i("getEmojiByEmojiId","getEmojiByEmojiId onFailed.....")
                onSuccessData(null)
            }
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: EmojiEntity) {
                onSuccessData(data)
            }
        })
    }


    fun insertEmoji(data: EmojiEntity) {

        getEmojiRepository().insertEmoji(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }


    fun updateEmoji(data: EmojiEntity) {

        getEmojiRepository().updateEmoji(data, object : StateResponseCallback {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {
                _eventFinishState.postValue(true)
            }

            override fun onHideProgress() {
                _eventShowProgressState.postValue(false)

            }

            override fun onShowProgress() {
                _eventShowProgressState.postValue(true)

            }

            override fun onSuccess() {
                _eventSuccessState.postValue(true)
            }
        }
        )
    }


    //----------------------------------------------------------------------------------




}