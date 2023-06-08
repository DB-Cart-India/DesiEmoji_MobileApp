package com.desiemoji.keyboard.repository.emoji

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.emoji.EmojiDao
import com.desiemoji.keyboard.data.local.emoji.EmojiEntity
import com.frogobox.sdk.ext.executeRoomDB
import com.frogobox.sdk.ext.fetchRoomDB
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class EmojiRepositoryImpl @Inject constructor(
    private val dao: EmojiDao,
) : EmojiRepository {

    private val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    fun onClearDisposables() {
        compositeDisposable.clear()
    }

    fun addSubscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun getAllEmoji(callback: DataResponseCallback<List<EmojiEntity>>) {
        dao.getAllEmoji().fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getEmojiBySubCategoryId(
        subCategoryId: Long,
        callback: DataResponseCallback<List<EmojiEntity>>,
    ) {
        dao.getEmojiBySubCategoryId(subCategoryId).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getEmojiByCategoryId(
        categoryId: Long,
        callback: DataResponseCallback<List<EmojiEntity>>,
    ) {
        dao.getEmojiByCategoryId(categoryId).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getEmojiByEmojiId(
        emojiId: Long,
        callback: DataResponseCallback<EmojiEntity>,
    ) {
        dao.getEmojiByEmojiId(emojiId).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getEmojiBySearch(
        searchText: String,
        callback: DataResponseCallback<List<EmojiEntity>>,
    ) {
        dao.getEmojiBySearch(searchText).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }


    override fun insertEmoji(data: EmojiEntity, callback: StateResponseCallback) {
        dao.insert(data).executeRoomDB(callback)
    }

    override fun insertAllEmoji(data: List<EmojiEntity>, callback: StateResponseCallback) {
        dao.insert(data).executeRoomDB(callback)
    }

    override fun updateEmoji(data: EmojiEntity, callback: StateResponseCallback) {
        dao.update(data).executeRoomDB(callback)
    }

    override fun deleteEmoji(data: EmojiEntity, callback: StateResponseCallback) {
        dao.delete(data).executeRoomDB(callback)
    }

    override fun deleteMultipleEmoji(idList: List<Int>, callback: StateResponseCallback) {
        dao.delete(idList).executeRoomDB(callback)
    }

    override fun nukeEmoji(callback: StateResponseCallback) {
        dao.nukeData().executeRoomDB(callback)
    }

}