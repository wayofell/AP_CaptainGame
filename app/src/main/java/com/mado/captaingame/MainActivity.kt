package com.mado.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mado.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }

            }
        }
    }
}

@Composable
fun CaptainGame() {

    val treasure = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("") }
    val onepiece = remember { mutableStateOf("") }



    Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Text(text = "Сокровищ найдено: ${treasure.value}")
            Text(text = "Текущее направление: ${direction.value}")
            Text(text = "${onepiece.value}")

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Button(onClick = {
                    direction.value = "Север"
                    if (Random.nextBoolean()) {
                        treasure.value++;
                        onepiece.value = "Вы нашли Данилу!"
                    } else {
                        onepiece.value = "Данила еще не найден((("
                    }
                }) {
                    Text("Север")
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(onClick = {
                    direction.value = "Юг"
                    if (Random.nextBoolean()) {
                        treasure.value++;
                        onepiece.value = "Вы нашли Данилу!"
                    } else {
                        onepiece.value = "Данила еще не найден((("
                    }
                }) {
                    Text("Юг")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Button(onClick = {
                    direction.value = "Запад"
                    if (Random.nextBoolean()) {
                        treasure.value++;
                        onepiece.value = "Вы нашли Данилу!"
                    } else {
                        onepiece.value = "Данила еще не найден((("
                    }
                }) {
                    Text("Запад")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Button(onClick = {
                    direction.value = "Восток"
                    if (Random.nextBoolean()) {
                        treasure.value++;
                        onepiece.value = "Вы нашли Данилу!"
                    } else {
                        onepiece.value = "Данила еще не найден((("
                    }
                }) {
                    Text("Восток")
                }
            }

        }
    }


}

















//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CaptainGameTheme {
//        Greeting("Android")
//    }
//}