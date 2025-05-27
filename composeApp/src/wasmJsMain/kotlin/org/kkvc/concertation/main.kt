package org.kkvc.concertation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import androidx.compose.runtime.remember

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App()
    }
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
