package com.desiemoji.keyboard.data.local.category

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = CategoryAttr.TABLE_NAME)
data class CategoryEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = CategoryAttr.ATTR_TABLE_ID)
    var tableId: Int = 0,

    @ColumnInfo(name = CategoryAttr.ATTR_CATEGORY_ID)
    var categoryId: Int = 0,

    @ColumnInfo(name = CategoryAttr.ATTR_CATEGORY_NAME)
    var categoryName: String = "",

    @ColumnInfo(name = CategoryAttr.ATTR_CATEGORY_ICON)
    var categoryIcon: String = "",

    @ColumnInfo(name = CategoryAttr.ATTR_CATEGORY_ICON_PATH)
    var categoryIconPath: String = "",

    @ColumnInfo(name = CategoryAttr.ATTR_CREATED_AT)
    var createdAt: String = "",

    @ColumnInfo(name = CategoryAttr.ATTR_UPDATED_AT)
    var updatedAt: String = "",

    @ColumnInfo(name = CategoryAttr.ATTR_ACTIVE)
    var active: Boolean =false,

   )