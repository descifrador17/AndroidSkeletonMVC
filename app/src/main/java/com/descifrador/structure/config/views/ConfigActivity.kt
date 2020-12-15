package com.descifrador.structure.config.views

import android.os.Bundle
import android.os.Handler
import com.descifrador.structure.AppController
import com.descifrador.structure.R
import com.descifrador.structure.config.presenter.ConfigPresenter
import com.descifrador.structure.config.presenter.ConfigView
import com.descifrador.structure.di.injector.Injector
import com.descifrador.structure.model.manager.NetworkingInterface
import com.descifrador.structure.utils.base.BaseActivity
import javax.inject.Inject

class ConfigActivity: BaseActivity<ConfigPresenter>(), ConfigView {

    @Inject
    lateinit var activityPresenter: ConfigPresenter

    @Inject
    lateinit var networkInterface: NetworkingInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        //setContentView(R.layout.demo_View)
        super.onCreate(savedInstanceState)
    }

    override fun inject(injector: Injector) {
        /**
         * Make Dependency Injection for Activity in di
         *
         */
        //injector.inject(this)
    }

    override fun getPresenter(): ConfigPresenter {
        return activityPresenter
    }

    override fun onSetupViews() {

    }

    override fun onError(throwable: Throwable) {
        //Show Error Message
    }

    override fun onConfigDataDelivered() {
        /**
         * start activities based on App Config
         *
         * if user registered
         * Home
         * else
         * New User etc
         */
    }

    override fun onUserDataDelivered() {
        /**
         * start activities based on User Config
         *
         * if user registered
         * Home
         * else
         * New User etc
         */
    }

    override fun onNetworkError(throwable: Throwable) {

    }
}