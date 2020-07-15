package com.deeshant.deeshantsbnri.data.local.db.dao

import androidx.room.*
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import io.reactivex.Single


@Dao
interface DummyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createAll(list: List<DummyResponse>)

    @Query("SELECT * FROM DummyResponse")
    fun getAll(): Single<List<DummyResponse>>
}