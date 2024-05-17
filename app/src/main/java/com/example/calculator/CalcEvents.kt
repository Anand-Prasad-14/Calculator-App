package com.example.calculator

 sealed class CalcEvents {
     data class Number(val number: Int): CalcEvents()
     data object Clear: CalcEvents()
     data object Delete: CalcEvents()
     data object Decimal: CalcEvents()
     data object Calculate: CalcEvents()
     data class Operation(val operation: CalcOperation): CalcEvents()
}