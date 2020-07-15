package com.deeshant.deeshantsbnri.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.deeshant.deeshantsbnri.data.local.db.dao.DummyDao
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import javax.inject.Singleton

@Singleton
@Database(
    entities = [
        DummyResponse::class
    ],
    exportSchema = false,
    version = 1
)
@TypeConverters(Converter::class)
abstract class DatabaseService : RoomDatabase() {

    abstract fun dummyDao(): DummyDao
}