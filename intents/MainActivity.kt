package com.example.exercise2_6

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.exercise2_6.ui.theme.Exercise2_6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Exercise2_6Theme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            val intent = Intent(this@MainActivity, StandardActivity::class.java)
                            startActivity(intent)
                        }
                    ) {
                        Text("Exercise 1: Explicit Intent")
                    }

                    Button(
                        onClick = {
                            val intent = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://developer.android.com")
                            )
                            startActivity(intent)
                        },
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Text("Exercise 2: Implicit Intent")
                    }
                }
            }
        }
    }
}