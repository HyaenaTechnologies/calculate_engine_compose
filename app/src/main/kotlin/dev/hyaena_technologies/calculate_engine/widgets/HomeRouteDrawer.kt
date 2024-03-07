package dev.hyaena_technologies.calculate_engine.widgets

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun HomeRouteDrawer() {
    val homeRouteDrawerItemList = listOf(
        Icons.Default.Favorite,
        Icons.Default.Face,
        Icons.Default.Email,
    )
    val homeRouteDrawerScope = rememberCoroutineScope()
    val homeRouteDrawerState = rememberDrawerState(DrawerValue.Closed)
    val homeRouteSelectedDrawerItem = remember {
        mutableStateOf(homeRouteDrawerItemList[0])
    }
    BackHandler(enabled = homeRouteDrawerState.isOpen) {
        homeRouteDrawerScope.launch {
            homeRouteDrawerState.close()
        }
    }
    DismissibleNavigationDrawer(
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {

            }
        },
        drawerContent = {
            DismissibleDrawerSheet {
                Spacer(Modifier.height(12.dp))
                homeRouteDrawerItemList.forEach { homeRouteNavigationDrawerItem ->
                    NavigationDrawerItem(
                        icon = {
                            Icon(
                                homeRouteNavigationDrawerItem,
                                contentDescription = null
                            )
                        },
                        label = { Text(homeRouteNavigationDrawerItem.name) },
                        modifier = Modifier.padding(horizontal = 12.dp),
                        onClick = {
                            homeRouteDrawerScope.launch {
                                homeRouteDrawerState.close()
                            }
                            homeRouteSelectedDrawerItem.value =
                                homeRouteNavigationDrawerItem
                        },
                        selected = homeRouteNavigationDrawerItem ==
                                homeRouteSelectedDrawerItem.value,
                    )
                }
            }
        },
        drawerState = homeRouteDrawerState,
        gesturesEnabled = true,
    )
}