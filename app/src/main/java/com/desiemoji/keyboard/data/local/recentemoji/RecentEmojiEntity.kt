package com.desiemoji.keyboard.data.local.recentemoji

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = RecentEmojiAttr.TABLE_NAME)
data class RecentEmojiEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = RecentEmojiAttr.ATTR_TABLE_ID)
    var tableId: Int = 0,

    @ColumnInfo(name = RecentEmojiAttr.ATTR_EMOJI_CODE)
    var emojiCode: String = "",
   )