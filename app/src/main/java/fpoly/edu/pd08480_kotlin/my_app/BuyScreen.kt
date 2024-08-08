package fpoly.edu.pd08480_kotlin.my_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import fpoly.edu.pd08480_kotlin.R

val ShopListBuy = mutableListOf<ShopModel>()

@Composable
fun BuyScreen (navController: NavController){
    Column() {
        Button(onClick = { navController.navigate("homescreen") }) {
            Image(painter = painterResource(R.mipmap.ic_back), contentDescription = "trở về", modifier = Modifier.padding(10.dp))
            LazyColumn {
                items(ShopListBuy) {
                        model -> CardItemBuy(model = model,navController)
                }
            }
        }
    }
}
@Composable
fun CardItemBuy(model: ShopModel, navController: NavController){
    Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = model.image), contentDescription = "Ảnh thời trang", modifier = Modifier.width(200.dp))
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)){
            Text(text = model.name)
            Text(text = model.price)
            Row(){
                Button(onClick = { navController.navigate("homescreen") }) {
                    Image(painter = painterResource(id = R.mipmap.ic_plus), contentDescription ="thêm" )
                }
                Text(text = "0")
                Button(onClick = { navController.navigate("homescreen") }) {
                    Image(painter = painterResource(id = R.mipmap.ic_remove), contentDescription ="xóa" )
                }
            }
        }
    }
}