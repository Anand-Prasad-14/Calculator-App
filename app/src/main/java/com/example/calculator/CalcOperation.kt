package com.example.calculator

 sealed class CalcOperation(val symbol: String){
     data object Add: CalcOperation("+")
     data object Subtract: CalcOperation("-")
     data object Multiply: CalcOperation("*")
     data object Divide: CalcOperation("/")
}