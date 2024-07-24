@file:OptIn(ExperimentalMaterial3Api::class)

package fpoly.edu.pd08480_kotlin.mylab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.ui.theme.PD08480_KotlinTheme
@Composable
fun ShowText(msg: String) {
    Text(text = msg,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        color = Color.Red,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic
    )
}
@ExperimentalMaterial3Api
@Composable
fun CounterCard(navController: NavController) {
    var count by remember { mutableIntStateOf(0) }
    var textSize by remember {
        mutableStateOf(20.sp)
    }
    var textColor by remember {
        mutableStateOf(Color.Black)
    }
    var a by remember {
        mutableStateOf("Hi")
    }
    Column (
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ShowText(msg = "You have clicked the button $count times")
        Button(onClick = { count++}) {
            Text("Click me")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Hello Android",
            fontSize = textSize,
            color = textColor)
        Button(onClick = {
            textSize = if (textSize == 20.sp) 30.sp else 20.sp
            textColor = if (textColor == Color.Black) Color.Blue else Color.Black
        }) {
            Text(text = "Change text color and size")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("A bằng = $a")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            if(a == "Hi"){
                a = "Quách Hoàng Bo - pd08480"
            }else{
                a = "Hi"
            }
        }) {
            Text("Click!")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()
    PD08480_KotlinTheme {
        CounterCard(navController)
//        TinhTong()
    }
}