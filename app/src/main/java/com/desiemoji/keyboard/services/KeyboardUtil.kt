package com.desiemoji.keyboard.services

import com.desiemoji.keyboard.R
import com.desiemoji.keyboard.model.KeyboardHeaderData
import com.desiemoji.keyboard.model.KeyboardHeaderType


object KeyboardUtil {

    fun menuKeyboard(): List<KeyboardHeaderData> {
        return listOf(
            KeyboardHeaderData(
                KeyboardHeaderType.AUTOTEXT,
                R.drawable.ic_auto_text
            ),
            KeyboardHeaderData(
                KeyboardHeaderType.NEWS,
                R.drawable.ic_keyboard_news
            ),
            KeyboardHeaderData(
                KeyboardHeaderType.MOVIE,
                R.drawable.ic_keyboard_movie
            ),
            KeyboardHeaderData(
                KeyboardHeaderType.WEB,
                R.drawable.ic_search
            ),
            KeyboardHeaderData(
                KeyboardHeaderType.FORM,
                R.drawable.ic_keyboard
            ),
        )
    }

}