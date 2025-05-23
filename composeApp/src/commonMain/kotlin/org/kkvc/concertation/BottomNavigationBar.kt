package org.kkvc.concertation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon // Pour le composable Icon de Material 3
import androidx.compose.material3.Text // Pour le composable Text de Material 3
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.ui.tooling.preview.Preview


import org.kkvc.concertation.data.BottomNavigation

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigation(
        title = "Notifications",
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigation(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    ),
)


@Composable
fun BottomNavigationBar() {
//    var selectedItem by remember { mutableStateOf(0) }
//    val items = listOf("Accueil", "Favoris", "Réglages")
//    val icons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Settings)
//
//    NavigationBar(
//        containerColor = MaterialTheme.colorScheme.error
//    ) {
//        items.forEachIndexed { index, item ->
//            NavigationBarItem(
//                icon = { Icon(icons[index], contentDescription = item) },
//                label = { Text(item) },
//                selected = selectedItem == index,
//                onClick = { selectedItem = index }
//            )
//        }
//    }

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.error
    )  {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseSurface)
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(text = item.title,
                            color = MaterialTheme.colorScheme.onBackground)
                    }
                )
            }
        }
    }
}


