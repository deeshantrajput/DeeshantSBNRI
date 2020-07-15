package com.deeshant.deeshantsbnri.ui.dummies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001eJ\b\u0010!\u001a\u00020\u001bH\u0016R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesViewModel;", "Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "schedulerProvider", "Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "databaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "dummyRepository", "Lcom/deeshant/deeshantsbnri/data/repository/DummyRepository;", "(Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;Lcom/deeshant/deeshantsbnri/data/repository/DummyRepository;)V", "dummyLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/deeshant/deeshantsbnri/utils/common/Resource;", "", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/DummyResponse;", "last_page", "", "getLast_page", "()I", "setLast_page", "(I)V", "page", "per_page", "getAll", "", "getData", "getDummies", "Landroidx/lifecycle/LiveData;", "isDummiesFetching", "", "onCreate", "app_debug"})
public final class DummiesViewModel extends com.deeshant.deeshantsbnri.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.deeshant.deeshantsbnri.utils.common.Resource<java.util.List<com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse>>> dummyLiveData = null;
    private int page = 1;
    private int per_page = 10;
    private int last_page = 0;
    private final com.deeshant.deeshantsbnri.data.repository.DummyRepository dummyRepository = null;
    
    public final int getLast_page() {
        return 0;
    }
    
    public final void setLast_page(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse>> getDummies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isDummiesFetching() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void getData() {
    }
    
    public final void getAll() {
    }
    
    public DummiesViewModel(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.repository.DummyRepository dummyRepository) {
        super(null, null, null, null);
    }
}