package com.descifrador.structure.di.injector

import com.descifrador.structure.AppController
import com.descifrador.structure.di.component.AppComponent
import com.descifrador.structure.di.component.DaggerAppComponent
import com.descifrador.structure.di.module.AppModule

class DaggerInjector:Injector{

    lateinit var appComponent: AppComponent

    /**
     * AppComponent Initialization
     *
     */
    override fun init(appController: AppController) {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(appController))
            .build()
    }


    /**
     *
     * Injecting Activities
     *
     */


    /**
     *
     * Injecting Fragments
     *
     */

}