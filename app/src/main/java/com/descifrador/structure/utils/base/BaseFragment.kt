package com.descifrador.structure.utils.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.descifrador.structure.AppController
import com.descifrador.structure.di.injector.Injector

abstract class BaseFragment<P : BasePresenter> : Fragment() , BaseView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject((activity?.applicationContext as AppController).getDaggerInjector())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPresenter().onViewCreated(savedInstanceState == null)
    }

    abstract fun inject(injector : Injector)

    abstract fun getPresenter(): P
}