package fpoly.edu.pd08480_kotlin.mylab

import fpoly.edu.pd08480_kotlin.R

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

data class SubjectModel(val name: String, val image: Int)
val subjectList = mutableListOf<SubjectModel>()

@Composable
fun SubjectRow (model: SubjectModel) {
    Row (
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(color = Color.LightGray)
            .border(BorderStroke(2.dp, Color.Gray))
    ){
        Image(painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(10.dp))

        Text(text = model.name,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black)
    }
}

@Composable
fun Lab6b1(navController: NavHostController) {
    subjectList.add(SubjectModel("Android", R.drawable.android))
    subjectList.add(SubjectModel("Java", R.drawable.java))
    subjectList.add(SubjectModel("PHP", R.drawable.php))
    subjectList.add(SubjectModel("Python", R.drawable.python))
    subjectList.add(SubjectModel("Node js", R.drawable.nodejs))
    subjectList.add(SubjectModel("Android", R.drawable.android))
    subjectList.add(SubjectModel("Java", R.drawable.java))
    subjectList.add(SubjectModel("PHP", R.drawable.php))
    subjectList.add(SubjectModel("Python", R.drawable.python))
    subjectList.add(SubjectModel("Node js", R.drawable.nodejs))

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp, 50.dp)
    ) {
        Text(text = "Các ngôn ngữ thông dụng", fontSize = 30.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(30.dp))

        LazyColumn {
            items(subjectList) {
                    model -> SubjectRow(model = model)
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true )
@Composable
fun Review2(){
    val navController = rememberNavController()
    Lab6b1(navController)
}