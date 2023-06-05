package com.example.bsp01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bsp01.ui.theme.Bsp01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bsp01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Bsp01()
                }
            }
        }
    }
}

fun checkInput(input:String):Boolean{
    return input.isNotEmpty()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Bsp01() {
    val textMVC1 = remember {  mutableStateOf("Dies ist ein Text")   }
    val textMVC2 = remember {  mutableStateOf("Anja")   }
    val buttonEnabled = checkInput(textMVC1.value)
    val labelColor = if(buttonEnabled) Color.Blue else Color.Red

    Column(){
        Text(
            text="Hallo Welt",
            //style = MaterialTheme.typography.h3,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text="Anja",
            //style = MaterialTheme.typography.h3,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = textMVC1.value,
            placeholder = {
                Text("Bitte eine Eingabe", color=Color.Magenta)
            },
            label = {
                Text(
                    text = "Eingabe",
                    color = labelColor,
                    //style = MaterialTheme.typography.caption
                )
            },
            onValueChange={
                textMVC1.value=it
                println("****** ${textMVC1.value}")
            }
        ) // TextField
        Spacer(modifier = Modifier.height(20.dp))


        Button(
            modifier = Modifier
                .padding(all = 8.dp),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                //backgroundColor = Color.DarkGray,
                contentColor = Color.Green,
                //disabledBackgroundColor = Color.LightGray,
                disabledContentColor =   Color.Yellow
            ),
            enabled = buttonEnabled,
            onClick = {
                val input = textMVC1.value
                textMVC2.value = input
            },
        ) {
            Text(text = "Action")
        }


    } // Column
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Bsp01Theme {
        Bsp01()
    }
}