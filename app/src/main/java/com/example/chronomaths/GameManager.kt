package com.example.chronomaths

import com.example.chronomaths.operation.Addition
import com.example.chronomaths.operation.EquationData
import com.example.chronomaths.operation.Operation
import kotlin.math.abs
import kotlin.random.Random

class GameManager {
    var score: Int = 0;
    var level: Int = 1;
    var timeSpent: Float = 0F;
    var timer: Float = 0F;
    lateinit var equationData: EquationData;
    var availableOperations: MutableList<Operation>

    init {
        availableOperations = mutableListOf<Operation>(Addition())
    }

    private fun IncrementScore() {
        val increment = (abs(20 - timeSpent.toInt()) + 1) * 5 * level
        score += increment
    }

    public fun InitTurn(){
        //Select the next operation type
        val nextOperationIndex = Random.nextInt(availableOperations.size)
        val operation = availableOperations[nextOperationIndex]

        equationData = operation.GetEquation(level)
    }


}