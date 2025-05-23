package org.kkvc.concertation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.ComposeUIViewController
import androidx.compose.runtime.remember

fun MainViewController() = ComposeUIViewController { App() }

@Composable
actual fun rememberSystemUiController(): SystemUiController {
    return remember {
        object : SystemUiController {
            override fun setStatusBarColor(color: Color) {
                // Code iOS spécifique via NSObject ou expect/actual helpers
            }

            override fun setNavigationBarColor(color: Color) {
                // idem
            }
        }
    }
}