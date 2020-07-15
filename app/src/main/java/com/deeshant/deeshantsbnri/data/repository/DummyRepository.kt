package com.deeshant.deeshantsbnri.data.repository

import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.data.remote.NetworkService
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject

class DummyRepository @Inject constructor(
    private val networkService: NetworkService,
    private val databaseService: DatabaseService
) {

    fun fetchDummy(page: Int, per_page: Int): Single<Response<List<DummyResponse>>> =
        networkService.doDummyCall(page, per_page)
}