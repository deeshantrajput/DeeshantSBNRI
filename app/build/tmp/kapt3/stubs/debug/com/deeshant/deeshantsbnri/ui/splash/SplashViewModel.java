package com.deeshant.deeshantsbnri.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R)\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/splash/SplashViewModel;", "Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "schedulerProvider", "Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "databaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "(Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;)V", "launchDummy", "Landroidx/lifecycle/MutableLiveData;", "Lcom/deeshant/deeshantsbnri/utils/common/Event;", "", "", "getLaunchDummy", "()Landroidx/lifecycle/MutableLiveData;", "onCreate", "", "app_debug"})
public final class SplashViewModel extends com.deeshant.deeshantsbnri.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Event<java.util.Map<java.lang.String, java.lang.String>>> launchDummy = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Event<java.util.Map<java.lang.String, java.lang.String>>> getLaunchDummy() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService) {
        super(null, null, null, null);
    }
}