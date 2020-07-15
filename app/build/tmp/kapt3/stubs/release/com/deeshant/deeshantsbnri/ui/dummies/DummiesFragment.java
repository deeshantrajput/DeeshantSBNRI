package com.deeshant.deeshantsbnri.ui.dummies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J\b\u0010\"\u001a\u00020\u001eH\u0014J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\'"}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesFragment;", "Lcom/deeshant/deeshantsbnri/ui/base/BaseFragment;", "Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesViewModel;", "()V", "dummiesAdapter", "Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesAdapter;", "getDummiesAdapter", "()Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesAdapter;", "setDummiesAdapter", "(Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesAdapter;)V", "isLastPage", "", "()Z", "setLastPage", "(Z)V", "isLoading", "setLoading", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "injectDependencies", "", "fragmentComponent", "Lcom/deeshant/deeshantsbnri/di/component/FragmentComponent;", "provideLayoutId", "setupObservers", "setupView", "view", "Landroid/view/View;", "Companion", "app_release"})
public final class DummiesFragment extends com.deeshant.deeshantsbnri.ui.base.BaseFragment<com.deeshant.deeshantsbnri.ui.dummies.DummiesViewModel> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.deeshant.deeshantsbnri.ui.dummies.DummiesAdapter dummiesAdapter;
    private boolean isLastPage = false;
    private boolean isLoading = false;
    private int page = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "DummiesFragment";
    public static final com.deeshant.deeshantsbnri.ui.dummies.DummiesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.deeshant.deeshantsbnri.ui.dummies.DummiesAdapter getDummiesAdapter() {
        return null;
    }
    
    public final void setDummiesAdapter(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.ui.dummies.DummiesAdapter p0) {
    }
    
    public final boolean isLastPage() {
        return false;
    }
    
    public final void setLastPage(boolean p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @java.lang.Override()
    protected int provideLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.di.component.FragmentComponent fragmentComponent) {
    }
    
    @java.lang.Override()
    protected void setupObservers() {
    }
    
    @java.lang.Override()
    protected void setupView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public DummiesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/deeshant/deeshantsbnri/ui/dummies/DummiesFragment;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.deeshant.deeshantsbnri.ui.dummies.DummiesFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}