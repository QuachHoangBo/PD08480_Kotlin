package fpoly.edu.pd08480_kotlin.my_app

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.R
import fpoly.edu.pd08480_kotlin.ui.theme.PD08480_KotlinTheme

@Composable
fun SigninActivity(navController: NavController){
    val context = LocalContext.current
    var nameUser by remember {
        mutableStateOf("")
    }
    var passUser by remember {
        mutableStateOf("")
    }
    var passUser2 by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Hello!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,

        )
        Text(
            text = "Wellcome back",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,

        )
        Spacer(modifier = Modifier.height(50.dp))
        TextField(
            value = nameUser,
            onValueChange = { newNameUser -> nameUser = newNameUser },
            label = { Text("Email hoặc số điện thoại") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = passUser,
            onValueChange = { newPassUser -> passUser = newPassUser },
            label = { Text("Mật khẩu") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = passUser,
            onValueChange = { newPassUser2 -> passUser2 = newPassUser2 },
            label = { Text("Nhập lại mật khẩu") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { Toast.makeText(context, "Đang cập nhật thêm!", Toast.LENGTH_SHORT).show() }) {
            Text("Đăng ký ")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate("login") }) {
            Text("Đã có tài khoản")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    PD08480_KotlinTheme {
        val navController = rememberNavController()
        SigninActivity(navController)
    }
}