package com.desiemoji.keyboard.data.local.emoji

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = EmojiAttr.TABLE_NAME)
data class EmojiEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EmojiAttr.ATTR_TABLE_ID)
    var tableId: Int = 0,

    @ColumnInfo(name = EmojiAttr.ATTR_EMOJI_ID)
    var emojiId: Int = 0,

    @ColumnInfo(name = EmojiAttr.ATTR_EMOJI_KEYWORD)
    var emojiKeyword: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_SUBCATEGORY_ID)
    var subCategoryId: Int = 0,

    @ColumnInfo(name = EmojiAttr.ATTR_CATEGORY_ID)
    var categoryId: Int = 0,

    @ColumnInfo(name = EmojiAttr.ATTR_EMOJI_ICON)
    var emojiIcon: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_EMOJI_ICON_PATH)
    var emojiIconPath: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_EMOJI_ICON_WEBP)
    var emojiIconWebp: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_EMOJI_ICON_WEBP_PATH)
    var emojiIconWebpPath: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_CREATED_AT)
    var createdAt: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_UPDATED_AT)
    var updatedAt: String = "",

    @ColumnInfo(name = EmojiAttr.ATTR_ACTIVE)
    var active: Boolean =false,
)
