package com.deeshant.deeshantsbnri.data.remote.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DummyRequest(
    @Expose
    @SerializedName("page")
    var page: Int,

    @Expose
    @SerializedName("per_page")
    var per_page: Int
)