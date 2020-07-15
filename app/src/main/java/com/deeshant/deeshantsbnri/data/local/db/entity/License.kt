package com.deeshant.deeshantsbnri.data.local.db.entity

import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class License(
    @field:SerializedName("key") val key: String,
    @field:SerializedName("name") val name: String,
@field:SerializedName("spdx_id") val spdx_id: String,
@field:SerializedName("url") val url: String,
@field:SerializedName("node_id") val node_id: String
)
