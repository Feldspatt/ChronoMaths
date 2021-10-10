package com.example.chronomaths

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun GameScreen(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
            },
            text="1+1",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        var text by remember { mutableStateOf("Type Here...")}
        TextField(
            value = text,
            onValueChange = { newText -> text = newText }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun GameScreenPreview(){
    GameScreen(
        navController = rememberNavController()
    )
}