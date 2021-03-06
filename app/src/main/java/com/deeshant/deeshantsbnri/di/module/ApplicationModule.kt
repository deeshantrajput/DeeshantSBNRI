package com.deeshant.deeshantsbnri.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.deeshant.deeshantsbnri.BuildConfig
import com.deeshant.deeshantsbnri.SbnApplication
import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.data.remote.NetworkService
import com.deeshant.deeshantsbnri.data.remote.Networking
import com.deeshant.deeshantsbnri.di.ApplicationContext
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper
import com.deeshant.deeshantsbnri.utils.rx.RxSchedulerProvider
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: SbnApplication) {

    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(): Context = application

    /**
     * Since this function do not have @Singleton then each time CompositeDisposable is injected
     * then a new instance of CompositeDisposable will be provided
     */
    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    fun provideSchedulerProvider(): SchedulerProvider = RxSchedulerProvider()

    /**
     * We need to write @Singleton on the provide method if we are create the instance inside this method
     * to make it singleton. Even if we have written @Singleton on the instance's class
     */
    @Provides
    @Singleton
    fun provideDatabaseService(): DatabaseService =
        Room.databaseBuilder(
            application, DatabaseService::class.java,
            "deesahnt-sbnri-project-db"
        ).build()

    @Provides
    @Singleton
    fun provideNetworkService(): NetworkService =
        Networking.create(
            BuildConfig.BASE_URL,
            application.cacheDir,
            10 * 1024 * 1024 // 10MB
        )

    @Singleton
    @Provides
    fun provideNetworkHelper(): NetworkHelper = NetworkHelper(application)
}