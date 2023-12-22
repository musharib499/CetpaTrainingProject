package com.example.cetpatrainingproject.demoapp.ui

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class CetpaApplication : Application() {

    var sharedPreference:SharedPreferences? = null

    companion object {
        private var instance: CetpaApplication? = null

        fun getApplicationInstance(): CetpaApplication? {

            if (instance == null) {
                instance = CetpaApplication()

            } else instance
            return instance

        }
    }

    override fun onCreate() {
        super.onCreate()
        try {
            sharedPreference = this@CetpaApplication.getSharedPreferences("CetpaSharedPreference", Context.MODE_PRIVATE)
        }catch (e:Exception) {
            e.printStackTrace()
        }

    }



}