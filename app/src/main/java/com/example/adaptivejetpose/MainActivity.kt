package com.example.adaptivejetpose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.adaptivejetpose.ui.theme.AdaptiveJetposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdaptiveJetposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Box(
                       modifier = Modifier.padding(innerPadding),
                       contentAlignment = Alignment.Center
                   ){
                       Text(
                           text = "ProStudio",
                           style = TextStyle(
                               fontSize = 40.sp,
                               fontWeight = FontWeight.Bold,
                               color = Color.DarkGray
                           )
                       )
                   }
                }
            }
        }
    }
}
