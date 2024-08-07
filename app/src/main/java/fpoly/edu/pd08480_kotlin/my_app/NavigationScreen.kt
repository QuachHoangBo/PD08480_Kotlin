package fpoly.edu.pd08480_kotlin.my_app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigatorScreen(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen" ){
        // Assignment
        composable("homescreen"){ HomeScreen(navController = navController) }
        composable("itemscreen"){ ItemScreen(navController = navController) }

    }
}