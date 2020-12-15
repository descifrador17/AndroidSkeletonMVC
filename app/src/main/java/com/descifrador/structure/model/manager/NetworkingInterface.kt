package com.descifrador.structure.model.manager

import com.descifrador.structure.model.pojos.DemoData
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface NetworkingInterface {

    /**
     * Retrofit functions go here
     */
    @GET("URL")
    fun getDummyDataFromURL(@Query("user_id") userId:String, @Header("Authorization") authHeader:String):Flowable<DemoData>
}