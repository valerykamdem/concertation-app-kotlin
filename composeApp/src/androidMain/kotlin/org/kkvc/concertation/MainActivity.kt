package org.kkvc.concertation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.remember

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}


@Composable
actual fun rememberSystemUiController(): SystemUiController {
    return remember {
        object : SystemUiController {
            override fun setStatusBarColor(color: Color) {
                // Utilise Window ou Context pour changer la couleur de la status bar
            }

            override fun setNavigationBarColor(color: Color) {
                // Gère la couleur de la navigation bar
            }
        }
    }
}