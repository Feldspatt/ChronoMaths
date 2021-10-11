package com.example.chronomaths

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.chronomaths.operation.EquationData
import com.example.chronomaths.screen.Screen

@Composable
fun GameScreen(
    navController: NavController
){
    var gameManager: GameManager = remember(GameManager())

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
            },
            text= "jean",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        var text by remember { mutableStateOf("Type Here...")}
        TextField(
            modifier = Modifier.border(
                BorderStroke(2.dp, Color.Blue),
                shape = RoundedCornerShape(8.dp),
            ),
            value = text,
            onValueChange = { newText -> text = newText },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent
            ),
        )
        Spacer(
            modifier = Modifier.height(40.dp))
        OutlinedButton(
            modifier = Modifier.size(50.dp),
            border = BorderStroke(2.dp, Color.Green),
            contentPadding = PaddingValues(0.dp),
            shape = CircleShape,
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor =  Color.Green),
            onClick = {  }
        ) {
            Icon(
                Icons.Filled.Done,
                contentDescription = "Refresh Button"
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun GameScreenPreview(){
    GameScreen(
        navController = rememberNavController()
    )
}