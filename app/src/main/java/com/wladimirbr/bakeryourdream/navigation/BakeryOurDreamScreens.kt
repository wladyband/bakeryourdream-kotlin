package com.wladimirbr.bakeryourdream.navigation

enum class BakeryOurDreamScreens {
    SplashScreen,
    LoginScreen,
    HomeScreen;

    companion object {
        fun fromRoute(route: String?): BakeryOurDreamScreens
                = when(route?.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            LoginScreen.name -> LoginScreen
            HomeScreen.name -> HomeScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}