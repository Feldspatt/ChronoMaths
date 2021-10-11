package com.example.chronomaths.operation

class Addition: Operation() {
    override fun GenerateVariables(level: Int): Pair<Int, List<Int>> {
        val result = (Math.random().toInt() + 1) * level * 4
        var cachedResult = result

        val variables = mutableListOf<Int>()

        while(cachedResult != 0){
            var variable = (Math.random().toInt() * result) + 1
            if (cachedResult - variable < 0) {
                variable = cachedResult
                cachedResult= 0
            }

            variables.add(variable)
        }

        return Pair(result, variables.toList())
    }

    override fun GenerateExpression(result: Int, variables: List<Int>): String {
        var expression: String = ""
        variables.forEachIndexed { index, element ->
            expression += "$element "
            expression += if(index != variables.size - 1) "+ " else "= "

        }

        expression += result
        return expression
    }

}