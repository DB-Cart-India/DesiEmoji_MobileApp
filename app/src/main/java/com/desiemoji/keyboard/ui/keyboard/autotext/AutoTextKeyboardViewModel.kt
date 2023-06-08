package com.desiemoji.keyboard.ui.keyboard.autotext

import android.content.Context
import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.data.local.autotext.AutoTextEntity
import com.desiemoji.keyboard.data.local.db.AppDatabase
import com.desiemoji.keyboard.repository.autotext.AutoTextRepository
import com.desiemoji.keyboard.repository.autotext.AutoTextRepositoryImpl


class AutoTextKeyboardViewModel(val context: Context) {

    private fun getRepository() : AutoTextRepository {
        return AutoTextRepositoryImpl(AppDatabase.newInstance(context).autoTextDao())
    }

    fun getAutoText(onSuccessData: (List<AutoTextEntity>) -> Unit) {
        getRepository().getAutoText(object : DataResponseCallback<List<AutoTextEntity>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {}
            override fun onFinish() {}
            override fun onHideProgress() {}
            override fun onShowProgress() {}
            override fun onSuccess(data: List<AutoTextEntity>) {
                onSuccessData(data)
            }
        })
    }

}