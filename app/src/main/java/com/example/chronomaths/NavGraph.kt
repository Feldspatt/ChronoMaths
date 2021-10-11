package com.example.chronomaths

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chronomaths.screen.HomeScreen
import com.example.chronomaths.screen.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Game.route
        ){
            GameScreen(navController = navController)
        }
    }
}