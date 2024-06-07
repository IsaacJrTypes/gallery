package com.example.gallery

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gallery.ui.theme.GalleryTheme
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GalleryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GalleryScreen()
                }
            }
        }
    }
}

@Composable
fun GalleryScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            // Art Image
            Row (
                modifier = Modifier.background(Color.Blue)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.birds),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .padding(16.dp),
                    contentScale = ContentScale.Fit
                )
            }
            Spacer(modifier = Modifier.height(40.dp))

            // Art title
            Row(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth(1f),
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = "Existential Crisis",
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = "Unknown (2021)",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }

            }

            // Button row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = { /* TODO */ }) {
                    Text(text = "Previous")
                }
                Button(onClick = { /* TODO */ }) {
                    Text(text = "Next")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GalleryScreenPreview() {
    GalleryTheme {
        GalleryScreen()
    }
}
