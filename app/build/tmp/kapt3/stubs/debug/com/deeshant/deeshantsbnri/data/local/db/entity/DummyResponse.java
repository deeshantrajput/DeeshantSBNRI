package com.deeshant.deeshantsbnri.data.local.db.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "DummyResponse")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u00c6\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\bH\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lcom/deeshant/deeshantsbnri/data/local/db/entity/DummyResponse;", "", "id", "", "name", "", "description", "open_issues_count", "", "license", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/License;", "permissions", "Lcom/deeshant/deeshantsbnri/data/local/db/entity/Permisions;", "(JLjava/lang/String;Ljava/lang/String;ILcom/deeshant/deeshantsbnri/data/local/db/entity/License;Lcom/deeshant/deeshantsbnri/data/local/db/entity/Permisions;)V", "getDescription", "()Ljava/lang/String;", "getId", "()J", "getLicense", "()Lcom/deeshant/deeshantsbnri/data/local/db/entity/License;", "getName", "getOpen_issues_count", "()I", "getPermissions", "()Lcom/deeshant/deeshantsbnri/data/local/db/entity/Permisions;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class DummyResponse {
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @com.google.gson.annotations.SerializedName(value = "open_issues_count")
    private final int open_issues_count = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "license")
    private final com.deeshant.deeshantsbnri.data.local.db.entity.License license = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "permissions")
    private final com.deeshant.deeshantsbnri.data.local.db.entity.Permisions permissions = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int getOpen_issues_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.License getLicense() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.Permisions getPermissions() {
        return null;
    }
    
    public DummyResponse(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, int open_issues_count, @org.jetbrains.annotations.Nullable()
    com.deeshant.deeshantsbnri.data.local.db.entity.License license, @org.jetbrains.annotations.Nullable()
    com.deeshant.deeshantsbnri.data.local.db.entity.Permisions permissions) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.License component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.Permisions component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, int open_issues_count, @org.jetbrains.annotations.Nullable()
    com.deeshant.deeshantsbnri.data.local.db.entity.License license, @org.jetbrains.annotations.Nullable()
    com.deeshant.deeshantsbnri.data.local.db.entity.Permisions permissions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}