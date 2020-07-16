package com.deeshant.deeshantsbnri.data.local.db.entity

import com.google.gson.annotations.SerializedName

data class Permisions(
    @field:SerializedName("admin") val admin: Boolean,
    @field:SerializedName("push") val push: Boolean,
    @field:SerializedName("pull") val pull: Boolean
)
