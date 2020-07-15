package com.deeshant.deeshantsbnri.data.local.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/deeshant/deeshantsbnri/data/local/db/Converter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "PermToString", "", "nestedData", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/Permisions;", "nestedDataToString", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/License;", "stringToNestedData", "json", "stringToPerm", "app_debug"})
public final class Converter {
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.License stringToNestedData(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String nestedDataToString(@org.jetbrains.annotations.Nullable()
    com.deeshant.deeshantsbnri.data.local.db.entity.License nestedData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.Permisions stringToPerm(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String PermToString(@org.jetbrains.annotations.Nullable()
    com.deeshant.deeshantsbnri.data.local.db.entity.Permisions nestedData) {
        return null;
    }
    
    public Converter() {
        super();
    }
}