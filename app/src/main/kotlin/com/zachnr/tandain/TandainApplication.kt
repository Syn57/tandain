package com.zachnr.tandain

import android.app.Application
import com.zachnr.tandain.di.dispatchersProviderModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TandainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TandainApplication)
            modules(
                listOf (
                    dispatchersProviderModule
                )
            )
        }
    }
}