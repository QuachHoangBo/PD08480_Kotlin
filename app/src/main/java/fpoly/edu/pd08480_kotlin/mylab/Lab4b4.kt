package fpoly.edu.pd08480_kotlin.mylab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Lab4b4 (navController: NavController){
    Column(modifier =  Modifier.padding(20.dp)) {
        Row(modifier = Modifier.size(height = 100.dp, width = 400.dp)
                                ) {
            Text(text = "Text 1")
            Text(text = "Text 2")
        }
        Row(modifier = Modifier.size(height = 100.dp, width = 400.dp)) {
            Text(text = "Text 3")

        }
        Row(modifier = Modifier.size(height = 100.dp, width = 400.dp)) {
            Text(text = "Text 4")
            Text(text = "Text 5")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview3 () {
    val navController = rememberNavController()
    Lab4b4(navController)
}