package com.desiemoji.keyboard.repository.recentemoji

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity
import com.frogobox.sdk.ext.executeRoomDB
import com.frogobox.sdk.ext.fetchRoomDB
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class RecentEmojiRepositoryImpl @Inject constructor(
    private val dao: RecentEmojiDao,
) : RecentEmojiRepository {

    private val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    fun onClearDisposables() {
        compositeDisposable.clear()
    }

    fun addSubscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun getAllRecentEmojis(callback: DataResponseCallback<List<String>>) {
        dao.getAllRecentEmojis().fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getRecentEmojisByKeyword(
        code: String,
        callback: DataResponseCallback<List<RecentEmojiEntity>>,
    ) {
        dao.getRecentEmojisByKeyword(code).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }


    override fun insertRecentEmoji(emoji: RecentEmojiEntity, callback: StateResponseCallback) {
        dao.insert(emoji).executeRoomDB(callback)
    }

    override fun insertAllRecentEmoji(emoji: List<RecentEmojiEntity>, callback: StateResponseCallback) {
        dao.insert(emoji).executeRoomDB(callback)
    }

    override fun updateRecentEmoji(emoji: RecentEmojiEntity, callback: StateResponseCallback) {
        dao.update(emoji).executeRoomDB(callback)
    }

    override fun deleteRecentEmoji(emoji: RecentEmojiEntity, callback: StateResponseCallback) {
        dao.delete(emoji).executeRoomDB(callback)
    }

    override fun deleteMultipleRecentEmoji(idList: List<Int>, callback: StateResponseCallback) {
        dao.delete(idList).executeRoomDB(callback)
    }

    override fun nukeRecentEmoji(callback: StateResponseCallback) {
        dao.nukeData().executeRoomDB(callback)
    }

}