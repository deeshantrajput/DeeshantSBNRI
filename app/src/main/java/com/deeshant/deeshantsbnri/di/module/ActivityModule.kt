package com.deeshant.deeshantsbnri.di.module

import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.data.repository.DummyRepository
import com.deeshant.deeshantsbnri.ui.base.BaseActivity
import com.deeshant.deeshantsbnri.ui.dummy.DummyViewModel
import com.deeshant.deeshantsbnri.ui.splash.SplashViewModel
import com.deeshant.deeshantsbnri.utils.ViewModelProviderFactory
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class ActivityModule(private val activity: BaseActivity<*>) {

    @Provides
    fun provideLinearLayoutManager(): LinearLayoutManager = LinearLayoutManager(activity)

    @Provides
    fun provideSplashViewModel(
        schedulerProvider: SchedulerProvider,
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,
        database:DatabaseService
    ): SplashViewModel = ViewModelProviders.of(
        activity, ViewModelProviderFactory(SplashViewModel::class) {
            SplashViewModel(schedulerProvider, compositeDisposable, networkHelper, database)
        }).get(SplashViewModel::class.java)

    @Provides
    fun provideDummyViewModel(
        schedulerProvider: SchedulerProvider,
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,
        database:DatabaseService,
        dummyRepository: DummyRepository
    ): DummyViewModel = ViewModelProviders.of(
        activity, ViewModelProviderFactory(DummyViewModel::class) {
            DummyViewModel(schedulerProvider, compositeDisposable, networkHelper, database, dummyRepository)
        }).get(DummyViewModel::class.java)
}