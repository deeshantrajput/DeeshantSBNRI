package com.deeshant.deeshantsbnri.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/deeshant/deeshantsbnri/di/module/ApplicationModule;", "", "application", "Lcom/deeshant/deeshantsbnri/SbnApplication;", "(Lcom/deeshant/deeshantsbnri/SbnApplication;)V", "provideApplication", "Landroid/app/Application;", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideContext", "Landroid/content/Context;", "provideDatabaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "provideNetworkHelper", "Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "provideNetworkService", "Lcom/deeshant/deeshantsbnri/data/remote/NetworkService;", "provideSchedulerProvider", "Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.deeshant.deeshantsbnri.SbnApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.deeshant.deeshantsbnri.di.ApplicationContext()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    /**
     * Since this function do not have @Singleton then each time CompositeDisposable is injected
     * then a new instance of CompositeDisposable will be provided
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider provideSchedulerProvider() {
        return null;
    }
    
    /**
     * We need to write @Singleton on the provide method if we are create the instance inside this method
     * to make it singleton. Even if we have written @Singleton on the instance's class
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.deeshant.deeshantsbnri.data.local.db.DatabaseService provideDatabaseService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.deeshant.deeshantsbnri.data.remote.NetworkService provideNetworkService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.deeshant.deeshantsbnri.utils.network.NetworkHelper provideNetworkHelper() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.SbnApplication application) {
        super();
    }
}