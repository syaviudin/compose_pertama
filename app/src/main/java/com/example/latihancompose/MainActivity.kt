package com.example.latihancompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.latihancompose.ui.theme.LatihanComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello World!")

        }
    }
}

@Composable
fun MessageCard(name : String){
    Text(text = "Hello $name!")
}
@Preview
@Composable
fun DefaultPreview(){
    LatihanComposeTheme {
        MessageCard(name = "Android")
    }
}

