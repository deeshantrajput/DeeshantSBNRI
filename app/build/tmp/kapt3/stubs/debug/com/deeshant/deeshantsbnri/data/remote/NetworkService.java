package com.deeshant.deeshantsbnri.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/deeshant/deeshantsbnri/data/remote/NetworkService;", "", "doDummyCall", "Lio/reactivex/Single;", "Lretrofit2/Response;", "", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/DummyResponse;", "page", "", "per_page", "app_debug"})
@javax.inject.Singleton()
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repos")
    public abstract io.reactivex.Single<retrofit2.Response<java.util.List<com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse>>> doDummyCall(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int per_page);
}