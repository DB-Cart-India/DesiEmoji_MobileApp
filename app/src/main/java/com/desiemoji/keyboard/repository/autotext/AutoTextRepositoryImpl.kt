package com.desiemoji.keyboard.repository.autotext

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.autotext.AutoTextDao
import com.desiemoji.keyboard.data.local.autotext.AutoTextEntity
import com.desiemoji.keyboard.data.local.autotext.AutoTextLabel
import com.frogobox.sdk.ext.executeRoomDB
import com.frogobox.sdk.ext.fetchRoomDB
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject


class AutoTextRepositoryImpl @Inject constructor(
    private val dao: AutoTextDao,
) : AutoTextRepository {

    private val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    fun onClearDisposables() {
        compositeDisposable.clear()
    }

    fun addSubscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun getAutoText(callback: DataResponseCallback<List<AutoTextEntity>>) {
        dao.getAll().fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getAutoTextByLabel(
        label: AutoTextLabel,
        callback: DataResponseCallback<List<AutoTextEntity>>,
    ) {
        dao.getByLabel(label).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getAutoTextByTitle(
        title: String,
        callback: DataResponseCallback<List<AutoTextEntity>>,
    ) {
        dao.getByTitle(title).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getAutoTextByBody(
        body: String,
        callback: DataResponseCallback<List<AutoTextEntity>>,
    ) {
        dao.getByBody(body).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getAutoTextByTitleOrBody(
        keyword: String,
        callback: DataResponseCallback<List<AutoTextEntity>>,
    ) {
        dao.getByTitleOrBody(keyword).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun insertAutoText(autoText: AutoTextEntity, callback: StateResponseCallback) {
        dao.insert(autoText).executeRoomDB(callback)
    }

    override fun insertAutoText(autoTexts: List<AutoTextEntity>, callback: StateResponseCallback) {
        dao.insert(autoTexts).executeRoomDB(callback)
    }

    override fun updateAutoText(autoText: AutoTextEntity, callback: StateResponseCallback) {
        dao.update(autoText).executeRoomDB(callback)
    }

    override fun deleteAutoText(autoText: AutoTextEntity, callback: StateResponseCallback) {
        dao.delete(autoText).executeRoomDB(callback)
    }

    override fun deleteAutoText(idList: List<Int>, callback: StateResponseCallback) {
        dao.delete(idList).executeRoomDB(callback)
    }

    override fun nukeAutoText(callback: StateResponseCallback) {
        dao.nukeData().executeRoomDB(callback)
    }

}