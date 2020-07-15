package com.deeshant.deeshantsbnri.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0004J\b\u0010\u001e\u001a\u00020\u001dH\u0004J\b\u0010\u001f\u001a\u00020 H\u0014J\u0019\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0004\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020 H\u0014J\b\u0010&\u001a\u00020 H&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "schedulerProvider", "Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "databaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "(Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getDatabaseService", "()Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "messageString", "Landroidx/lifecycle/MutableLiveData;", "Lcom/deeshant/deeshantsbnri/utils/common/Resource;", "", "getMessageString", "()Landroidx/lifecycle/MutableLiveData;", "messageStringId", "", "getMessageStringId", "getNetworkHelper", "()Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "getSchedulerProvider", "()Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "checkInternetConnection", "", "checkInternetConnectionWithMessage", "forcedLogoutUser", "", "handleNetworkError", "err", "", "(Ljava/lang/Throwable;)Lkotlin/Unit;", "onCleared", "onCreate", "app_release"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Resource<java.lang.Integer>> messageStringId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Resource<java.lang.String>> messageString = null;
    @org.jetbrains.annotations.NotNull()
    private final com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider schedulerProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final com.deeshant.deeshantsbnri.utils.network.NetworkHelper networkHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService = null;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Resource<java.lang.Integer>> getMessageStringId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Resource<java.lang.String>> getMessageString() {
        return null;
    }
    
    protected final boolean checkInternetConnectionWithMessage() {
        return false;
    }
    
    protected final boolean checkInternetConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlin.Unit handleNetworkError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable err) {
        return null;
    }
    
    protected void forcedLogoutUser() {
    }
    
    public abstract void onCreate();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.deeshant.deeshantsbnri.utils.network.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.deeshant.deeshantsbnri.data.local.db.DatabaseService getDatabaseService() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService) {
        super();
    }
}