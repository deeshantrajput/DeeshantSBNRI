package com.deeshant.deeshantsbnri.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/deeshant/deeshantsbnri/data/repository/DummyRepository;", "", "networkService", "Lcom/deeshant/deeshantsbnri/data/remote/NetworkService;", "databaseService", "Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "(Lcom/deeshant/deeshantsbnri/data/remote/NetworkService;Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;)V", "fetchDummy", "Lio/reactivex/Single;", "Lretrofit2/Response;", "", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/DummyResponse;", "page", "", "per_page", "app_release"})
public final class DummyRepository {
    private final com.deeshant.deeshantsbnri.data.remote.NetworkService networkService = null;
    private final com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<retrofit2.Response<java.util.List<com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse>>> fetchDummy(int page, int per_page) {
        return null;
    }
    
    @javax.inject.Inject()
    public DummyRepository(@org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.remote.NetworkService networkService, @org.jetbrains.annotations.NotNull()
    com.deeshant.deeshantsbnri.data.local.db.DatabaseService databaseService) {
        super();
    }
}