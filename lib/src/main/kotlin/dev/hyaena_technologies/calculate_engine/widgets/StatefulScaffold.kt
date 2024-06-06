package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope

// Home Route Stateful Scaffold Widget
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatefulScaffold() {
    val drawerScope: CoroutineScope = rememberCoroutineScope()
    val drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed)
    val scroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Scaffold(
            bottomBar = {
                StatelessNavigationBar()
            },
            content = { innerPadding ->
                LazyColumn(
                    modifier = Modifier.consumeWindowInsets(innerPadding),
                    contentPadding = innerPadding
                ) {

                }
            },
            drawerContent = {
                StatelessDrawer(drawerScope, drawerState)
            },
            drawerElevation = 6.dp,
            topBar = {
                StatelessTopAppBar(scroll)
            },
        )
    }
}