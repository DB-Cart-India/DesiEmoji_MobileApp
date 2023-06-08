package com.desiemoji.keyboard.data.local.sample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName



@Entity(tableName = SampleAttr.TABLE_NAME)
data class SampleEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = SampleAttr.ATTR_TABLE_ID)
    var table_id: Int = 0,

    @ColumnInfo(name = SampleAttr.ATTR_ID)
    var id: Int = 0,

    @ColumnInfo(name = SampleAttr.ATTR_DATA)
    @SerializedName("data")
    var data: String = "",

)