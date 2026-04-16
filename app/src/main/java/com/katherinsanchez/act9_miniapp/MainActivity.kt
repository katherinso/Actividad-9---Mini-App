package com.katherinsanchez.act9_miniapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Routes.HOME) {

                composable(Routes.HOME) {
                    HomeScreen(navController)
                }

                composable(
                    route = Routes.DETAIL + "/{name}",
                    arguments = listOf(navArgument("name") { type = NavType.StringType })
                ) { backStackEntry ->
                    val name = backStackEntry.arguments?.getString("name") ?: ""
                    DetailScreen(navController, name)
                }

                composable(Routes.INFO) {
                    InfoScreen(navController)
                }

            }
        }
    }
}