package com.deeshant.deeshantsbnri.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/deeshant/deeshantsbnri/di/module/FragmentModule;", "", "fragment", "Lcom/deeshant/deeshantsbnri/ui/base/BaseFragment;", "(Lcom/deeshant/deeshantsbnri/ui/base/BaseFragment;)V", "provideDummiesAdapter", "Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesAdapter;", "provideDummiesViewModel", "Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesViewModel;", "schedulerProvider", "Lcom/deeshant/deeshantsbnri/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/deeshant/deeshantsbnri/utils/network/NetworkHelper;", "databaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "dummyRepository", "Lcom/deeshant/deeshantsbnri/data/repository/DummyRepository;", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "app_debug"})
@dagger.Module()
public final class FragmentModule {
    private final com.deeshant.deeshantsbnri.ui.base.BaseFragment<?> fragment = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.deeshant.deeshantsbnri.ui.dummies.DummiesViewModel provideDummiesViewModel(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.repository.DummyRepository dummyRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.deeshant.deeshantsbnri.ui.dummies.DummiesAdapter provideDummiesAdapter() {
        return null;
    }
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.ui.base.BaseFragment<?> fragment) {
        super();
    }
}