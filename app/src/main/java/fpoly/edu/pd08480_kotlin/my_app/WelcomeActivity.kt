package fpoly.edu.pd08480_kotlin.my_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.R

@Composable
fun WelcomeAcitivy(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_welcome),
            contentDescription = "Image welcome",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "MAKE YOUR" , fontSize = 24.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "HOME BEAUTIFUL" , fontSize = 40.sp , color = Color.DarkGray)
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = """The best simple place where you 
            |discover most wonderful furnitures 
            |and make your home beautiful""".trimMargin()
                , fontSize = 14.sp
                , color = Color.Gray
                ,
            )
            Spacer(modifier = Modifier.height(100.dp))
            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(text = "Get Started")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    val navController = rememberNavController()
    WelcomeAcitivy(navController)
}
