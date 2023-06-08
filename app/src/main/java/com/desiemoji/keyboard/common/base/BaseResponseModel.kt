package com.desiemoji.keyboard.common.base

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class BaseResponseModel<T>(

    @SerializedName("code")
    var code: Int? = 0,

    @SerializedName("message")
    var message: String? = "",

    @SerializedName("data")
    var data: T? = null,

)