package com.deeshant.deeshantsbnri.data.remote

import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*
import javax.inject.Singleton

@Singleton
interface NetworkService {


    @GET(Endpoints.DUMMY)
    fun doDummyCall(
        @Query("page")page: Int,
        @Query("per_page")per_page: Int
    ): Single<Response<List<DummyResponse>>>
}