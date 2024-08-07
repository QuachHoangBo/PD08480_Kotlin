package fpoly.edu.pd08480_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import fpoly.edu.pd08480_kotlin.my_app.NavigatorScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    MyApp()
                    NavigatorScreen()
                }
            }
        }
    }
}
//@Composable
//    fun Greeting(name: String) {
//        Text(
//        text = "Hello, $name!",
//            modifier = Modifier
//                .padding(0.dp, 16.dp)
//                .fillMaxWidth(),
//            color = Color.DarkGray,
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Bold,
//            textAlign = TextAlign.Center,
//    )
//}
