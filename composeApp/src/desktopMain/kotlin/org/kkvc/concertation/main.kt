package org.kkvc.concertation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Concertation",
    ) {
        App()
    }
}

@Composable
actual fun rememberSystemUiController(): SystemUiController {
    return remember {
        object : SystemUiController {
            override fun setStatusBarColor(color: Color) {}
            override fun setNavigationBarColor(color: Color) {}
        }
    }
}