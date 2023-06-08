package com.desiemoji.keyboard.model


sealed class SpinnerItemType {

    data class Loading(
        val isLoading: Boolean = true,
    ) : SpinnerItemType()

    data class Content(
        val data: String,
    ) : SpinnerItemType()

}