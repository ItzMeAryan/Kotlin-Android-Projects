package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random


 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    captainGame(
                        modifier = Modifier.padding(innerPadding).fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun captainGame(modifier: Modifier = Modifier) {
    val treasuresFound = remember { mutableStateOf(0)}
//   another way to write same -  val treasuresFound by remember { mutableStateOf(0) }
    // here instead of treasuresFound.value, we can directly write treasuresFound
    val direction = remember { mutableStateOf("North") }
    val stormOrTreasure = remember { mutableStateOf("") }
    Column{
        Box(
            modifier = Modifier
                .height(32.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
        )
        Text(
            text = "Treasures Found: ${treasuresFound.value}."
        )
        Text(
            text = "Current Direction: ${direction.value}."
        )
        Text(
            text = "${stormOrTreasure.value}"
        )
        Button(onClick = {
            direction.value = "East"
            if (Random.nextBoolean()) {
                treasuresFound.value += 1
                stormOrTreasure.value = "We Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }

        }){
            Text("Sail East")
        }

        Button(onClick = {
            direction.value = "West"
            if (Random.nextBoolean()) {
                treasuresFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }){
            Text("Sail West")
        }

        Button(onClick = {
            direction.value = "North"
            if (Random.nextBoolean()) {
                treasuresFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }){
            Text("Sail North")
        }

        Button(onClick = {
            direction.value = "South"
            if (Random.nextBoolean()) {
                treasuresFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }){
            Text("Sail South")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CaptainGameTheme {
        captainGame()
    }
}


// 1) remember
// 2) mutableStateOf()
// 3) Implementing State