package com.metehanbolat.composelearningss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.metehanbolat.composelearningss.ui.theme.ComposeLearningSSTheme
import com.metehanbolat.composelearningss.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningSSTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLearningSSTheme {
        Column(
            modifier = Modifier.fillMaxSize().padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary
            ){}
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary
            ){}
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary
            ){}
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colors.primary
            ){}
        }
    }
}