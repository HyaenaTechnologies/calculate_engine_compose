package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeRouteBottomBar() {
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                Icon(
                    contentDescription = "Basic Calculator",
                    imageVector = Icons.Outlined.Add,
                )
            },
            label = { Text("Basic") },
            onClick = {},
            selected = false,
        )
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                Icon(
                    contentDescription = "OpenStax Web View",
                    imageVector = Icons.Outlined.AccountCircle,
                )
            },
            label = { Text("OpenStax") },
            onClick = {},
            selected = false,
        )
    }
}