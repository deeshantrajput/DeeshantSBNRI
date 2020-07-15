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

    /*
     * Example to add other headers
     *
     *  @POST(Endpoints.DUMMY_PROTECTED)
        fun sampleDummyProtectedCall(
            @Body request: DummyRequest,
            @Header(Networking.HEADER_USER_ID) userId: String, // pass using UserRepository
            @Header(Networking.HEADER_ACCESS_TOKEN) accessToken: String, // pass using UserRepository
            @Header(Networking.HEADER_API_KEY) apiKey: String = Networking.API_KEY // default value set when Networking create is called
        ): Single<DummyResponse>
     */
}