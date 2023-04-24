package com.alina.lovecalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alina.lovecalculator2.databinding.ActivityMainBinding
import com.alina.lovecalculator2.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
   private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= inflate(layoutInflater)
        setContentView(binding.root)
    }
}