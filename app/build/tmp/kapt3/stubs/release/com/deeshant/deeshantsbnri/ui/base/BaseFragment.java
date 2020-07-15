package com.deeshant.deeshantsbnri.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H$J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u001fH%J\b\u0010 \u001a\u00020\u000fH\u0014J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0017H$J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010#\u001a\u00020\u001f\u00a2\u0006\u0002\u0010$J\u0015\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020&\u00a2\u0006\u0002\u0010\'R \u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006("}, d2 = {"Lcom/deeshant/deeshantsbnri/ui/base/BaseFragment;", "VM", "Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "getViewModel", "()Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "setViewModel", "(Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;)V", "Lcom/deeshant/deeshantsbnri/ui/base/BaseViewModel;", "buildFragmentComponent", "error/NonExistentClass", "()Lerror/NonExistentClass;", "goBack", "", "injectDependencies", "fragmentComponent", "Lcom/deeshant/deeshantsbnri/di/component/FragmentComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "provideLayoutId", "", "setupObservers", "setupView", "showMessage", "resId", "(I)Lkotlin/Unit;", "message", "", "(Ljava/lang/String;)Lkotlin/Unit;", "app_release"})
public abstract class BaseFragment<VM extends com.deeshant.deeshantsbnri.ui.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public VM viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final error.NonExistentClass buildFragmentComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    protected void setupObservers() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit showMessage(@androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    public final void goBack() {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int provideLayoutId();
    
    protected abstract void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.di.component.FragmentComponent fragmentComponent);
    
    protected abstract void setupView(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public BaseFragment() {
        super();
    }
}