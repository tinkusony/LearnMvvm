package com.tinku.learnmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.tinku.learnmvvm.databinding.ActivityMainBinding
import com.tinku.learnmvvm.viewModel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.sum.setOnClickListener {
            val num1 = binding.num1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.num2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calculateSum(num1, num2)
            binding.result.text = "${result.sum}"
        }
        binding.sub.setOnClickListener {
            val num1 = binding.num1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.num2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calculateSum(num1, num2)
            binding.result.text = "${result.sub}"
        }
    }
}