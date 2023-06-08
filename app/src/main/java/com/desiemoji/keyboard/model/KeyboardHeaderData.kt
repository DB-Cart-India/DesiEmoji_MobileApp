package com.desiemoji.keyboard.model

import androidx.annotation.Keep


@Keep
data class KeyboardHeaderData(
    val type: KeyboardHeaderType,
    val icon: Int
)