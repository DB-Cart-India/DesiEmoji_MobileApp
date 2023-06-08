package com.desiemoji.keyboard.data.remote.emoji

import com.google.gson.annotations.SerializedName

//class EmojiResponse(elements: Collection<EmojiResponseElement>) : ArrayList<EmojiResponseElement>(elements) {
//    public fun toJson() = klaxon.toJsonString(this)
//
//    companion object {
//        public fun fromJson(json: String) = EmojiResponse(klaxon.parseArray<EmojiResponseElement>(json)!!)
//    }
//}


data class EmojiResponse (
    val error: Boolean,
    val data: List<EmojiResponseData>
)

data class EmojiResponseData (
    @SerializedName("EmojiId")
    val emojiId: Long,

    @SerializedName("CategoryId")
    val categoryId: Long,

    @SerializedName("SubCategoryId")
    val subCategoryId: Long,

    @SerializedName("EmojiSearchKeyword")
    val emojiSearchKeyword: String,

    @SerializedName("EmojiLink")
    val emojiLink: String,

    val createdAt: String,

    val updatedAt: String,

    @SerializedName("Active")
    val active: Boolean
)
