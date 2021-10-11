package com.example.chronomaths.screen

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Game: Screen(route= "game_screen")
}
