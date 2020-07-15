package com.deeshant.deeshantsbnri

import android.app.Application
import com.deeshant.deeshantsbnri.di.component.ApplicationComponent
import com.deeshant.deeshantsbnri.di.component.DaggerApplicationComponent
import com.deeshant.deeshantsbnri.di.module.ApplicationModule

class SbnApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}