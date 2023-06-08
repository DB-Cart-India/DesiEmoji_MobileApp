package com.desiemoji.keyboard.repository.recentemoji

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity

interface RecentEmojiRepository {

    fun getAllRecentEmojis(callback: DataResponseCallback<List<String>>)

    fun getRecentEmojisByKeyword(code: String, callback: DataResponseCallback<List<RecentEmojiEntity>>)

    fun insertRecentEmoji(emoji: RecentEmojiEntity, callback: StateResponseCallback)

    fun insertAllRecentEmoji(emoji: List<RecentEmojiEntity>, callback: StateResponseCallback)

    fun updateRecentEmoji(emoji: RecentEmojiEntity, callback: StateResponseCallback)

    fun deleteRecentEmoji(emoji: RecentEmojiEntity, callback: StateResponseCallback)

    fun deleteMultipleRecentEmoji(idList: List<Int>, callback: StateResponseCallback)

    fun nukeRecentEmoji(callback: StateResponseCallback)

}