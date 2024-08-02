
    package fpoly.edu.pd08480_kotlin.mylab

    import androidx . compose . foundation . BorderStroke
            import androidx . compose . foundation . Image
            import androidx . compose . foundation . border
    import androidx.compose.foundation.layout.Arrangement
    import androidx . compose . foundation . layout . Column
            import androidx . compose . foundation . layout . Row
            import androidx . compose . foundation . layout . Spacer
            import androidx . compose . foundation . layout . fillMaxSize
            import androidx . compose . foundation . layout . fillMaxWidth
            import androidx . compose . foundation . layout . height
            import androidx . compose . foundation . layout . padding
            import androidx . compose . foundation . layout . size
    import androidx.compose.foundation.layout.width
    import androidx . compose . foundation . layout . wrapContentHeight
    import androidx.compose.foundation.lazy.LazyColumn
    import androidx . compose . foundation . lazy . LazyRow
    import androidx.compose.foundation.lazy.items
    import androidx.compose.material3.Button
    import androidx . compose . material3 . Text
            import androidx . compose . runtime . Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx . compose . ui . Modifier
            import androidx . compose . ui . graphics . Color
            import androidx . compose . ui . res . painterResource
            import androidx . compose . ui . text . font . FontWeight
            import androidx . compose . ui . tooling . preview . Preview
            import androidx . compose . ui . unit . dp
            import androidx . compose . ui . unit . sp
    import fpoly . edu . pd08480_kotlin . R



    data class MovieModel(val name: String, val time: String, val image: Int)
    enum class ListType {ROW,COLUMN,GRID }

    val MovieList = mutableListOf<MovieModel>()

    @Composable
    fun MovieColumn() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp, 50.dp)
        ) {
            Text(text = "Những bộ phim hay tháng này")
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn {
                items(MovieList) { model ->
                    MovieCard(model = model)
                }
            }
        }
    }
    @Composable
    fun MovieGrid() {

    }

    @Composable
        fun Lab6b2() {
        MovieList.add(
            MovieModel(
                "Phía sau 1 người thành đạt là 1 người vợ tài giỏi", "13-7-2023",
                R.drawable.image1
            )
        )
        MovieList.add(
            MovieModel(
                "Người chến thắng trò chơi cuộc đời", "13-7-2023",
                R.drawable.image2
            )
        )
        MovieList.add(
            MovieModel(
                "thiên thần Azazel", "13-7-2025",
                R.drawable.image3
            )
        )
            var listType by remember { mutableStateOf(ListType.ROW)}
            Column {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { listType = ListType.ROW }) {
                        Text("Row")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(onClick = { listType = ListType.COLUMN }) {
                        Text("Column")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(onClick = { listType = ListType.GRID }) {
                        Text("Grid")
                    }
                }
                when (listType) {
                ListType.ROW -> MovieRow()
                ListType.COLUMN -> MovieColumn()
                ListType.GRID -> MovieGrid()
            }
            }
        }



    @Composable
    fun  MovieRow() {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp, 50.dp)
        ) {
            Text(text = "Những bộ phim hay tháng này")
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow {
                items(MovieList) { model ->
                    MovieCard(model = model)
                }
            }
        }
    }

    @Composable
    fun MovieCard(model: MovieModel) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .border(
                    BorderStroke(
                        2.dp,
                        Color.Black
                    )
                )
        ) {
            Image(
                painter = painterResource(id = model.image),
                contentDescription = "Ảnh giới thiệu phim",
                modifier = Modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
            Text(
                text = model.name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(text = model.time, fontSize = 14.sp, color = Color.Gray)
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun reivew3() {
        Lab6b2()
    }
