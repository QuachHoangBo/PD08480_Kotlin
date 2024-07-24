package fpoly.edu.pd08480_kotlin.my_app

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.mylab.CounterCard
import fpoly.edu.pd08480_kotlin.mylab.Lab4b2
import fpoly.edu.pd08480_kotlin.mylab.Lab4b3
import fpoly.edu.pd08480_kotlin.mylab.MyLab

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "mylab" ){
        // Assignment
        composable("mylab"){ MyLab(navController = navController) }
        composable("welcome"){ WelcomeAcitivy(navController = navController)}
        composable("login"){ LoginActivity(navController = navController)}
        composable("signin"){ SigninActivity(navController = navController)}
        // Lab
        composable("lab3"){ CounterCard(navController = navController) }
        composable("lab4b2"){ Lab4b2(navController = navController) }
        composable("lab4b3"){ Lab4b3(navController = navController) }

    }
}