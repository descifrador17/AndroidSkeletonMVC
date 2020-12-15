package com.descifrador.structure.di.module

import com.descifrador.structure.AppController
import com.descifrador.structure.model.manager.NetworkingInterface
import com.descifrador.structure.utils.misc.AppConstants
import com.descifrador.structure.utils.misc.AppPreferences
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class AppModule {

    lateinit var appController: AppController

    constructor(appController: AppController) {
        this.appController = appController
    }


    @Singleton
    @Provides
    fun providesAppPreferences(): AppPreferences {
        return AppPreferences(appController)
    }

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(AppConstants.DEMO_TIMEOUT, TimeUnit.MILLISECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(gson: Gson?, okHttpClient: OkHttpClient?): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(AppConstants.DEMO_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }


    @Provides
    @Singleton
    fun providesJDNetworkingInterface(retrofit: Retrofit): NetworkingInterface {
        return retrofit.create(NetworkingInterface::class.java)
    }
}