package com.deeshant.deeshantsbnri.data.local.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "DummyResponse")
data class DummyResponse(

    @PrimaryKey @field:SerializedName("id") val id: Long,
    @field:SerializedName("name") val name: String,
    @field:SerializedName("description") val description: String?,
    @field:SerializedName("open_issues_count") val open_issues_count: Int,
    @field:SerializedName("license") val license: License?,
    @field:SerializedName("permissions") val permissions: Permisions?
)