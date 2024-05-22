package com.example.s1111187

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.s1111187.ui.theme.S1111187Theme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1111187Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Main()
                    //val navController = null
                    //SecondScreen(navController)
                }
            }
        }
    }
}
@Composable
fun SecondScreen(navController: NavController)  {
    val context = LocalContext.current
    val activity = (context as Activity)
    var appear by remember { mutableStateOf(true) }


    Column {

        Image(painter = painterResource(id = R.drawable.maria),
            contentDescription = "maria")

        Text(
            text = "主要機構",
            color = Color.Red
        )
        Row {
            Button(onClick = { appear = !appear

            }) {
                Text(text = "台中市愛心家園")
                
            }

            Button(onClick = {

            }) {
                Text(text = "瑪利亞學園")
                
            }
        }
        Text(text = "「台中市愛心家園」經市政府公開評選後，委託瑪利亞基金會經營管理，於91年啟用，整棟建築物有四個樓層，目前開辦就醫、就養、就學、就業四大領域的十項業務，提供身心障礙者全方位的服務。\n")
        
        Text(text = "長按以下圖片，可以觀看愛心家園地圖",color = Color.Blue)
        Image(painter = painterResource(id = R.drawable.lovehome), contentDescription = "lovehome")

    }
}

