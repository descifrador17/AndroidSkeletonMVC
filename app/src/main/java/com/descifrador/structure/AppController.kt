package com.descifrador.structure

import android.app.Application
import com.descifrador.structure.di.injector.DaggerInjector
import com.descifrador.structure.di.injector.Injector
import com.descifrador.structure.utils.misc.AppPreferences

class AppController : Application() {
    lateinit var injector: Injector
    lateinit var appPreferences: AppPreferences

    override fun onCreate() {
        super.onCreate()
        getDaggerInjector().init(this)
        appPreferences = AppPreferences(this)
    }

    /**
     * Get Dagger Injector
     *
     */
    fun getDaggerInjector(): Injector {
        if (!::injector.isInitialized) {
            injector = DaggerInjector()
        }
        return injector
    }

    /**
     * Toggle Mock APIs
     *
     */
    fun getHitMockAPI():Boolean{
        return false;
    }
}