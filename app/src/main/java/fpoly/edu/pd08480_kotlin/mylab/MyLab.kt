package fpoly.edu.pd08480_kotlin.mylab

import android.widget.Space
import android.widget.Toast
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.my_app.LoginActivity
import fpoly.edu.pd08480_kotlin.my_app.SigninActivity
import fpoly.edu.pd08480_kotlin.ui.theme.PD08480_KotlinTheme

@Composable
fun MyLab (navController: NavController){
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp))
        {

        Text(text="Tổng hợp bài Lab ",
            fontSize = 30.sp)
            Spacer(modifier = Modifier.height(10.dp))
        //Lab 3
        Row(modifier = Modifier
            .size(width = 400.dp, height = 50.dp)
            .horizontalScroll(
                rememberScrollState()
            )) {
            Button(onClick = { navController.navigate("lab3") }) {
                Text(text = "Lab 3")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Lab 4
        Row(modifier = Modifier.size(width = 400.dp, height = 50.dp)) {
            Button(onClick = { navController.navigate("login") }) {
                Text(text = "Lab 4b1")
            }
            Button(onClick = { navController.navigate("lab4b2") }) {
                Text(text = "Lab 4b2")
            }
            Button(onClick = { navController.navigate("lab4b3") }) {
                Text(text = "Lab 4b3")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Lab 5
        Row(modifier = Modifier.size(width = 400.dp, height = 50.dp)) {
            Button(onClick = { Toast.makeText(context,"Cập nhật thêm....",Toast.LENGTH_SHORT) }) {
                Text(text = "Lab 5")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Lab 6
        Row(modifier = Modifier.size(width = 400.dp, height = 50.dp)) {
            Button(onClick = { Toast.makeText(context,"Cập nhật thêm....",Toast.LENGTH_SHORT) }) {
                Text(text = "Lab 6")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Lab 7
        Row(modifier = Modifier.size(width = 400.dp, height = 50.dp)) {
            Button(onClick = { Toast.makeText(context,"Cập nhật thêm....",Toast.LENGTH_SHORT) }) {
                Text(text = "Lab 7")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Lab 8
        Row(modifier = Modifier.size(width = 400.dp, height = 50.dp)) {
            Button(onClick = { Toast.makeText(context,"Cập nhật thêm....",Toast.LENGTH_SHORT) }) {
                Text(text = "Lab 8")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.size(width = 400.dp, height = 50.dp)) {
                Button(onClick = { navController.navigate("welcome")} , colors = ButtonDefaults.buttonColors(
                    Color.Blue
                )){
                    Text(text = "Assignment")
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview4() {
    PD08480_KotlinTheme {
        val navController = rememberNavController()
        MyLab(navController)
    }
}
