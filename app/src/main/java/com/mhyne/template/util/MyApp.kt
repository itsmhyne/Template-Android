package com.mhyne.template.util

import android.app.Application
import com.chibatching.kotpref.Kotpref
import com.mhyne.template.core.depin.appModule
import com.mhyne.template.core.depin.repositoryModule
import com.mhyne.template.core.depin.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Kotpref.init(this)
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}