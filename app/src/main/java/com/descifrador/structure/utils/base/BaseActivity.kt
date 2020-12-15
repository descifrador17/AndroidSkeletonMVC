package com.descifrador.structure.utils.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.descifrador.structure.AppController
import com.descifrador.structure.di.injector.Injector

abstract class BaseActivity<P : BasePresenter> : AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject((applicationContext as AppController).getDaggerInjector())
        getPresenter().onViewCreated(savedInstanceState == null)
    }

    override fun onDestroy() {
        getPresenter().unsubscribe()
        super.onDestroy()
    }

    abstract fun inject(injector: Injector)

    abstract fun getPresenter(): P

}