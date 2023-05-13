package com.alina.lovecalculator2

import androidx.lifecycle.LiveData
import com.alina.lovecalculator2.remote.LoveModel

class LoveViewModel {
  private  val repository=Repository()
    fun liveLove(firstName: String, secondName:String):LiveData<LoveModel>{
        return repository.getLove(firstName,secondName)
    }
}