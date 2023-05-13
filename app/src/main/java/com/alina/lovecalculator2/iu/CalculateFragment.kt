package com.alina.lovecalculator2.iu

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alina.lovecalculator2.LoveViewModel
import com.alina.lovecalculator2.databinding.FragmentCalculateBinding


class CalculateFragment : Fragment() {
    private lateinit var binding: FragmentCalculateBinding
    val viewModel: LoveViewModel by viewModels()

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
                viewModel.liveLove(etMale.text.toString(), etFemale.text.toString()).observe(this@CalculateFragment){LoveModel->
                    Log.e("ololo","initClickers:${LoveModel}")
                }


            }

            }
        }
    }










