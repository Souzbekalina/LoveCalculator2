package com.alina.lovecalculator2.remote

import com.google.gson.annotations.SerializedName

data class LoveModel (
  @SerializedName("fname")
  var firstname:String,
  @SerializedName("sname")
  var secondName:String,
  var percentage:String,
  var result:String,
         ): java.io.Serializable
