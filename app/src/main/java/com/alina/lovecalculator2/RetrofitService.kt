package com.alina.lovecalculator2

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
  private  var retrofit= Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/getPercentage")
        .addConverterFactory(GsonConverterFactory.create()).build()
    var api=retrofit.create(LoveApi::class.java)

}