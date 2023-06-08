package com.desiemoji.keyboard.data.remote.emoji

import com.google.gson.annotations.SerializedName

//import com.beust.klaxon.Json
//import com.beust.klaxon.Klaxon

//private val klaxon = Klaxon()

data class CategoryResponse (
    val error: Boolean,
    val data: List<Datum>
)
//{
//    public fun toJson() = klaxon.toJsonString(this)
//
//    companion object {
//        public fun fromJson(json: String) = klaxon.parse<CategoryResponse>(json)
//    }
//}

data class Datum (
    @SerializedName("CategoryId")
    val categoryID: Long,

    @SerializedName("CategoryName")
    val categoryName: String,

    @SerializedName("CategoryIcon")
    val categoryIcon: String,

    val createdAt: String,

    val updatedAt: String,

    @SerializedName("Active")
    val active: Boolean
)
