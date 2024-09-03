package com.tinku.learnmvvm.viewModel

import androidx.lifecycle.ViewModel
import com.tinku.learnmvvm.model.CalculatorData

class CalculatorViewModel:ViewModel() {

    fun calculateSum(a:Int,b:Int):CalculatorData{
        val sum = a+b
        val sub = a-b
        return CalculatorData(a,b,sum,sub)
    }
}