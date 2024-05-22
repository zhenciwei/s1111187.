package com.example.s1111187

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
                    //Main()
                    SecondScreen()
                }
            }
        }
    }
}
@Composable
fun SecondScreen() {
    val context = LocalContext.current
    val activity = (context as Activity)
    Column {

        Image(painter = painterResource(id = R.drawable.maria),
            contentDescription = "maria")

        Text(
            text = "主要機構",
            color = Color.Red
        )

        Image(painter = painterResource(id = R.drawable.aurthor), contentDescription = "aurthor")

        Button(
            onClick = {
                activity.finish()
            })
        {
            Text(text = "服務總覽")
        }

    }
}

