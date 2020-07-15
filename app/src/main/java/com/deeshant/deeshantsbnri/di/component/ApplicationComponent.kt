package com.deeshant.deeshantsbnri.di.component

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.deeshant.deeshantsbnri.SbnApplication
import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.data.remote.NetworkService
import com.deeshant.deeshantsbnri.di.ApplicationContext
import com.deeshant.deeshantsbnri.di.module.ApplicationModule
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(app: SbnApplication)

    fun getApplication(): Application

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getNetworkHelper(): NetworkHelper

    fun getSchedulerProvider(): SchedulerProvider

    fun getCompositeDisposable(): CompositeDisposable
}