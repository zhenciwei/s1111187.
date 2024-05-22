package com.example.s1111187

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.s1111187.ui.theme.S1111187Theme

@OptIn(ExperimentalMaterial3Api::class)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1111187Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting("Android")
                    //Main()
                    FirstScreen()

                }
            }
        }
    }
}

@Composable
fun FirstScreen() {
    val context = LocalContext.current

    Column(modifier = Modifier) {
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = "maria"
        )

        Text(
            text = "簡介",
            color = Color.Blue
        )
        
        Image(painter = painterResource(id = R.drawable.service),
            contentDescription = "service")

        Button(onClick = {
            var it = Intent(context, SecondActivity::class.java)
            context.startActivity(it)
        })
        {
            Text(text = "資管系王英禎")
        }

    }
}
