package com.desiemoji.keyboard.repository.autotext

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.autotext.AutoTextEntity
import com.desiemoji.keyboard.data.local.autotext.AutoTextLabel

interface AutoTextRepository {

    fun getAutoText(callback: DataResponseCallback<List<AutoTextEntity>>)

    fun getAutoTextByLabel(label: AutoTextLabel, callback: DataResponseCallback<List<AutoTextEntity>>)

    fun getAutoTextByTitle(title: String, callback: DataResponseCallback<List<AutoTextEntity>>)

    fun getAutoTextByBody(body: String, callback: DataResponseCallback<List<AutoTextEntity>>)

    fun getAutoTextByTitleOrBody(keyword: String, callback: DataResponseCallback<List<AutoTextEntity>>)

    fun insertAutoText(autoText: AutoTextEntity, callback: StateResponseCallback)

    fun insertAutoText(autoTexts: List<AutoTextEntity>, callback: StateResponseCallback)

    fun updateAutoText(autoText: AutoTextEntity, callback: StateResponseCallback)

    fun deleteAutoText(autoText: AutoTextEntity, callback: StateResponseCallback)

    fun deleteAutoText(idList: List<Int>, callback: StateResponseCallback)

    fun nukeAutoText(callback: StateResponseCallback)

}