package com.descifrador.structure.utils.base

import androidx.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter {
    lateinit var baseView: BaseView
    lateinit var compositeDisposable: CompositeDisposable

    constructor(baseView: BaseView) {
        this.baseView = baseView
        compositeDisposable = CompositeDisposable()
    }

    @CallSuper
    fun unsubscribe() {
        compositeDisposable.clear()
    }

    fun addSubscription(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    abstract fun onViewCreated(isLaunched: Boolean)
}