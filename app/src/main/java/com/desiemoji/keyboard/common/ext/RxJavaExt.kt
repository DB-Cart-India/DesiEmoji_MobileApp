package com.desiemoji.keyboard.common.ext

import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

fun Disposable.disposedBy(compositeDisposable: CompositeDisposable?) {
    compositeDisposable?.add(this)
}