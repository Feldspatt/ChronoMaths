package com.example.chronomaths.operation

abstract class Operation (

        ){
        protected abstract fun GenerateVariables(level: Int): Pair<Int, List<Int>>

        protected abstract fun GenerateExpression(result: Int, variables: List<Int>): String

        fun GetEquation(level: Int): EquationData {
                val packedData = GenerateVariables(level)
                val expression = GenerateExpression(packedData.first, packedData.second)

                return EquationData(packedData.first, expression)
        }
}