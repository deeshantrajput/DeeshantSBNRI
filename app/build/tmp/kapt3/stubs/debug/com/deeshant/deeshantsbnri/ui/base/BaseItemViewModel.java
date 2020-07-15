package com.deeshant.deeshantsbnri.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/base/BaseItemViewModel;", "T", "", "Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "schedulerProvider", "Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "databaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "(Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "getData", "()Landroidx/lifecycle/MutableLiveData;", "onManualCleared", "", "updateData", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseItemViewModel<T extends java.lang.Object> extends com.deeshant.deeshantsbnri.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<T> data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<T> getData() {
        return null;
    }
    
    public final void onManualCleared() {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    T data) {
    }
    
    public BaseItemViewModel(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService) {
        super(null, null, null, null);
    }
}