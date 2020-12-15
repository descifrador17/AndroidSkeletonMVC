package com.descifrador.structure.di.component

import com.descifrador.structure.di.module.AppModule
import com.descifrador.structure.model.manager.NetworkingInterface
import com.descifrador.structure.utils.misc.AppPreferences
import com.google.gson.Gson
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun providesAppPreferences(): AppPreferences
    fun provideGson(): Gson
    fun providesOkHttpClient(): OkHttpClient
    fun providesRetrofit(): Retrofit
    fun providesJDNetworkingInterface(): NetworkingInterface

}