package fpoly.edu.pd08480_kotlin.my_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.R

@Composable
fun ItemScreen(navController: NavController){
    Column(modifier = Modifier.padding(10.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.image3), contentDescription = "Ảnh thời trang")
        Text(text = "Áo phông nam")
        Text(text = "23.000 đồng")
        Text("Mô tả: ")
        Button(onClick = { navController.navigate("homescreen") }) {
            Text(text = "Thêm vào giỏ hàng")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun reviewPage2(){
    val navController = rememberNavController()
    ItemScreen(navController)
}