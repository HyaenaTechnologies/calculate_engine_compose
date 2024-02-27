package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Home Route Widgets
@Composable
@OptIn(ExperimentalLayoutApi::class)
fun HomeRoute() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize(),
    ) {
        Scaffold(
            bottomBar = {
                HomeRouteBottomBar()
            },
            content = { innerPadding ->
                LazyColumn(
                    modifier = Modifier.consumeWindowInsets(innerPadding),
                    contentPadding = innerPadding
                ) {

                }
            },
            drawerContent = {
                HomeRouteDrawer()
            },
            drawerElevation = 6.dp,
            topBar = {
                HomeRouteTopBar()
            },
        )
    }
}