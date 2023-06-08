package com.desiemoji.keyboard.data.remote.sample

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName



@Keep
data class SampleResponse(
    @SerializedName("email")
    var email: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?
)