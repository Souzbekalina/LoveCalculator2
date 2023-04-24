package com.alina.lovecalculator2.iu

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.alina.lovecalculator2.LoveModel
import com.alina.lovecalculator2.R
import com.alina.lovecalculator2.RetrofitService
import com.alina.lovecalculator2.databinding.FragmentCalculateBinding
import javax.security.auth.callback.Callback


class CalculateFragment : Fragment() {
    private lateinit var binding: FragmentCalculateBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnCalculate.setOnClickListener {
                RetrofitService().api.percentageName(
                    etMale.text.toString(),
                    etFemale.text.toString()
                ).enqueue(object:Callback<LoveModel>)

                Log.e("ololo", "initClicker: $loveModel")
                    //findNavController().navigate(R.id.secondFragment)
                    findNavController().navigate(
                        R.id.resultFragment2,
                        bundleOf(MODEL_DATA to (loveModel.percentage))
                    )
                }
            }

        }

    companion object {
        const val MODEL_DATA = "DATA"



    }
