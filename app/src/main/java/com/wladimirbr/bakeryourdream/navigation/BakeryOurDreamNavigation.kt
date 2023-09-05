package com.wladimirbr.bakeryourdream.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wladimirbr.bakeryourdream.screens.home.HomeScreens
import com.wladimirbr.bakeryourdream.screens.login.LoginScreens

@Composable
fun BakeryOurDreamNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = BakeryOurDreamScreens.HomeScreen.name){

        composable(BakeryOurDreamScreens.HomeScreen.name){
            HomeScreens(navController = navController)
        }
    }
}