package fpoly.edu.pd08480_kotlin.my_app

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fpoly.edu.pd08480_kotlin.R

data class ShopModel2(val name: String, val image: Int, val price: String)
val ShopList2 = mutableListOf<ShopModel2>()

@Composable
fun HomeScreen2(navController: NavController){
    var searchValue by remember {
        mutableStateOf("")
    }
    val context = LocalContext.current
    ShopList2.add(ShopModel2("Áo phông rộng",R.drawable.image1,"23.000 đồng"))
    ShopList2.add(ShopModel2("Áo phông rộng",R.drawable.image2,"23.000 đồng"))
    ShopList2.add(ShopModel2("Áo phông rộng",R.drawable.image3,"23.000 đồng"))


    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .horizontalScroll(rememberScrollState())
        .padding(10.dp)) {
        TextField(modifier = Modifier.width(300.dp),value = searchValue, onValueChange = { newSearchValue -> searchValue = newSearchValue }, label = { Text(
            text = "Search"
        )} )
        Spacer(modifier = Modifier.height(5.dp))
        Row (modifier = Modifier
            .width(300.dp)
            .height(50.dp)){
            Button(onClick = { /*TODO*/ },) {
                Text(text = "Thời trang nam")
                navController.navigate("homescreen1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Thời trang nữ")
                navController.navigate("homescreen2")
                Toast.makeText(context,"Bạn đang ở trang này.", Toast.LENGTH_SHORT)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn {
            items(ShopList2) {
                    model -> CardItem2(model = model,navController)
            }
        }

    }


}

@Composable
fun CardItem2(model: ShopModel2, navController: NavController){
    Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = model.image), contentDescription = "Ảnh thời trang", modifier = Modifier.width(200.dp).height(200.dp))
        Column(modifier = Modifier.fillMaxSize().padding(10.dp)){
            Text(text = model.name)
            Text(text = model.price)
            Button(onClick = { navController.navigate("homescreen") }) {
                Text(text = "Chi tiết")
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun reviewPage3(){
    val navController = rememberNavController()
    HomeScreen2(navController)
}