package com.descifrador.structure.utils.misc

import android.content.Context
import android.content.SharedPreferences
import com.descifrador.structure.model.pojos.DemoData
import com.google.gson.Gson

class AppPreferences(context: Context) {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var sharedPreferencesEditor: SharedPreferences.Editor
    var SHARED_PREFERENCES_KEY = "SHARED_PREFERENCES_DATA"
    var SHARED_PREFERENCES_DEMO_DATA = "DEMO_DATA";


    init {
        sharedPreferences =
            context.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)
        sharedPreferencesEditor = sharedPreferences.edit()
    }

    /**
     * Demo for AppPreferences
     *
     */
    fun saveUserInfo(data: DemoData) {
        sharedPreferencesEditor.putString(SHARED_PREFERENCES_DEMO_DATA, Gson().toJson(data))
            .commit()
    }

}