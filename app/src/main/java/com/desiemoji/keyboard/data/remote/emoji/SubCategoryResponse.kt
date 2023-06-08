package com.desiemoji.keyboard.data.remote.emoji

import com.google.gson.annotations.SerializedName

data class SubCategoryResponse (
    val error: Boolean,
    val data: List<SubCategoryResponseData>
)

data class SubCategoryResponseData (
    @SerializedName("SubCategoryId")
    val subCategoryId: Long,

    @SerializedName("CategoryId")
    val categoryId: Long,

    @SerializedName("SubCategoryName")
    val subCategoryName: String,

    @SerializedName("SubCategoryIcon")
    val subCategoryIcon: String,

    val createdAt: String,

    val updatedAt: String,

    @SerializedName("Active")
    val active: Boolean
)

