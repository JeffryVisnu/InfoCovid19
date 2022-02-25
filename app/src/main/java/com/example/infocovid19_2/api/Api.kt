package com.example.infocovid19_2.api

import com.example.infocovid19_2.api.model.IndonesiaResponse
import com.example.infocovid19_2.api.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}