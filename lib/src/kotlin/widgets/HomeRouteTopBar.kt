package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomeRouteTopBar() {
    val homeRouteTopBarScrollBehavior =
        TopAppBarDefaults.enterAlwaysScrollBehavior()
    TopAppBar(
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    contentDescription = "Settings",
                    imageVector = Icons.Outlined.Settings,
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    contentDescription = "Application Information",
                    imageVector = Icons.Outlined.Info,
                )
            }
        },
        scrollBehavior = homeRouteTopBarScrollBehavior,
        title = {
            Text(
                "Home",
                maxLines = 1,
                softWrap = true,
                style = MaterialTheme.typography.headlineMedium,
            )
        },
    )
}