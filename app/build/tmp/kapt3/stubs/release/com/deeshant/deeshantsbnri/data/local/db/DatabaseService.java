package com.deeshant.deeshantsbnri.data.local.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.deeshant.deeshantsbnri.data.local.db.Converter.class})
@androidx.room.Database(entities = {com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse.class}, exportSchema = false, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/deeshant/deeshantsbnri/data/local/db/DatabaseService;", "Landroidx/room/RoomDatabase;", "()V", "dummyDao", "Lcom/deeshant/deeshantsbnri/data/local/db/dao/DummyDao;", "app_release"})
@javax.inject.Singleton()
public abstract class DatabaseService extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.deeshant.deeshantsbnri.data.local.db.dao.DummyDao dummyDao();
    
    public DatabaseService() {
        super();
    }
}