package com.example.airbnbmarkerapp

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/fe4ac334-f9e4-40cd-ac92-7b7ef521bafe")
    fun getHouseList(): Call<HouseDto>
}