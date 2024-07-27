
    package fpoly.edu.pd08480_kotlin.my_app

    import android . widget . Toast
            import androidx . compose . foundation . Image
            import androidx . compose . foundation . background
            import androidx . compose . foundation . layout . Arrangement
            import androidx . compose . foundation . layout . Column
            import androidx . compose . foundation . layout . Row
            import androidx . compose . foundation . layout . Spacer
            import androidx . compose . foundation . layout . fillMaxSize
            import androidx . compose . foundation . layout . fillMaxWidth
            import androidx . compose . foundation . layout . height
            import androidx . compose . foundation . layout . padding
            import androidx . compose . foundation . layout . size
    import androidx.compose.foundation.layout.width
    import androidx . compose . foundation . shape . RoundedCornerShape
            import androidx . compose . material . icons . Icons
            import androidx . compose . material . icons . filled . Check
            import androidx . compose . material3 . Button
            import androidx . compose . material3 . ButtonDefaults
            import androidx . compose . material3 . Icon
            import androidx . compose . material3 . Switch
            import androidx . compose . material3 . SwitchDefaults
            import androidx . compose . material3 . Text
            import androidx . compose . material3 . TextField
            import androidx . compose . runtime . Composable
            import androidx . compose . runtime . getValue
            import androidx . compose . runtime . mutableStateOf
            import androidx . compose . runtime . remember
            import androidx . compose . runtime . setValue
            import androidx . compose . ui . Alignment
            import androidx . compose . ui . Modifier
            import androidx . compose . ui . draw . clip
            import androidx . compose . ui . draw . shadow
            import androidx . compose . ui . graphics . Color
            import androidx . compose . ui . platform . LocalContext
            import androidx . compose . ui . res . painterResource
            import androidx . compose . ui . text . font . FontFamily
            import androidx . compose . ui . text . font . FontWeight
            import androidx . compose . ui . tooling . preview . Preview
            import androidx . compose . ui . unit . dp
            import androidx . compose . ui . unit . sp
            import androidx . navigation . NavController
            import androidx . navigation . compose . rememberNavController
            import fpoly . edu . pd08480_kotlin . R
            import fpoly . edu . pd08480_kotlin . ui . theme . PD08480_KotlinTheme

            @Composable
            fun LoginActivity(navController: NavController) {
                val context = LocalContext.current
                var nameUser by remember {
                    mutableStateOf("")
                }
                var passUser by remember {
                    mutableStateOf("")
                }
                var checkbox by remember { mutableStateOf(true) }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.LightGray)
                        .clip(RoundedCornerShape(30.dp)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(20.dp)
                            .background(color = Color.White),

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
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 0.dp, 20.dp, 0.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "Remeber me", fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(10.dp))
                            Switch(checked = checkbox,
                                onCheckedChange = {
                                    checkbox = it
                                    Toast.makeText(context, "Đã nhớ", Toast.LENGTH_SHORT)
                                },
                                thumbContent = if (checkbox) {
                                    {
                                        Icon(
                                            imageVector = Icons.Filled.Check,
                                            contentDescription = null,
                                            modifier = Modifier.size(SwitchDefaults.IconSize),
                                        )
                                    }
                                } else {
                                    null
                                }
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = { navController.navigate("signin") },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        ) {
                            Text("Forgot Password", color = Color.Black, fontSize = 14.sp)
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Button(
                            onClick = {
                                if (nameUser == "" || passUser == "") {
                                    Toast.makeText(
                                        context,
                                        "xin vui lòng nhập đầy đủ thông tin",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Đăng nhập thành công!",
                                        Toast.LENGTH_SHORT
                                    )
                                    navController.navigate("lab4b2")
                                }
                            }, colors = ButtonDefaults.buttonColors(Color.Black),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp)
                        ) {
                            Text("Log in")
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Button(
                            onClick = { navController.navigate("signin") },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        ) {
                            Text("SIGN UP", color = Color.Black)
                        }
                    }
                }
            }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        PD08480_KotlinTheme {
            val navController = rememberNavController()
            LoginActivity(navController)
        }
    }
