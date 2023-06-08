package com.desiemoji.keyboard.data.local.subcategory

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = SubCategoryAttr.TABLE_NAME)
data class SubCategoryEntity (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = SubCategoryAttr.ATTR_TABLE_ID)
    var tableId: Int = 0,

    @ColumnInfo(name = SubCategoryAttr.ATTR_SUBCATEGORY_ID)
    var subCategoryId: Int = 0,

    @ColumnInfo(name = SubCategoryAttr.ATTR_SUBCATEGORY_NAME)
    var subCategoryName: String = "",

    @ColumnInfo(name = SubCategoryAttr.ATTR_CATEGORY_ID)
    var categoryId: Int = 0,

    @ColumnInfo(name = SubCategoryAttr.ATTR_SUBCATEGORY_ICON)
    var subCategoryIcon: String = "",

    @ColumnInfo(name = SubCategoryAttr.ATTR_SUBCATEGORY_ICON_PATH)
    var subCategoryIconPath: String = "",

    @ColumnInfo(name = SubCategoryAttr.ATTR_CREATED_AT)
    var createdAt: String = "",

    @ColumnInfo(name = SubCategoryAttr.ATTR_UPDATED_AT)
    var updatedAt: String = "",

    @ColumnInfo(name = SubCategoryAttr.ATTR_ACTIVE)
    var active: Boolean =false,

)