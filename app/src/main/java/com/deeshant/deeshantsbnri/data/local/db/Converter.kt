package com.deeshant.deeshantsbnri.data.local.db

import androidx.room.TypeConverter
import com.deeshant.deeshantsbnri.data.local.db.entity.License
import com.deeshant.deeshantsbnri.data.local.db.entity.Permisions
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class Converter {

    private val gson = Gson()

    @TypeConverter
    fun stringToNestedData(json: String?): License? {
        val type: Type = object : TypeToken<License?>() {}.type
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun nestedDataToString(nestedData:License?): String? {
       val type: Type = object : TypeToken<License?>() {}.type
        return gson.toJson(nestedData, type)
    }

    @TypeConverter
    fun stringToPerm(json: String?): Permisions? {
        val type: Type = object : TypeToken<Permisions?>() {}.type
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun PermToString(nestedData:Permisions?): String? {
        val type: Type = object : TypeToken<Permisions?>() {}.type
        return gson.toJson(nestedData, type)
    }
}