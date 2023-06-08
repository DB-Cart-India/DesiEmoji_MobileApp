package com.desiemoji.keyboard.repository.emoji

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.emoji.EmojiEntity

interface EmojiRepository {

    fun getAllEmoji(callback: DataResponseCallback<List<EmojiEntity>>)

    fun getEmojiBySubCategoryId(subCategoryId: Long, callback: DataResponseCallback<List<EmojiEntity>>)

    fun getEmojiByCategoryId(categoryId: Long, callback: DataResponseCallback<List<EmojiEntity>>)

    fun getEmojiByEmojiId(emojiId: Long, callback: DataResponseCallback<EmojiEntity>)

    fun getEmojiBySearch(searchText: String, callback: DataResponseCallback<List<EmojiEntity>>)

    fun insertEmoji(data: EmojiEntity, callback: StateResponseCallback)

    fun insertAllEmoji(data: List<EmojiEntity>, callback: StateResponseCallback)

    fun updateEmoji(data: EmojiEntity, callback: StateResponseCallback)

    fun deleteEmoji(data: EmojiEntity, callback: StateResponseCallback)

    fun deleteMultipleEmoji(idList: List<Int>, callback: StateResponseCallback)

    fun nukeEmoji(callback: StateResponseCallback)

}