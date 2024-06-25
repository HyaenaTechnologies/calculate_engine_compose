package dev.hyaena_technologies.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.hyaena_technologies.calculate_engine.widgets.BasicCalculatorRoute
import dev.hyaena_technologies.calculate_engine.widgets.GitHubRoute
import dev.hyaena_technologies.calculate_engine.widgets.HomeRoute
import dev.hyaena_technologies.calculate_engine.widgets.OpenStaxRoute

// Navigation Model: Stateless
@Composable
fun NavigationModel(
    initialDestination: String,
    navigationController: NavHostController
) {
    NavHost(
        navController = navigationController,
        startDestination = initialDestination
    ) {
        composable(route = "Basic Calculator") {
            BasicCalculatorRoute()
        }

        composable(route = "Home") {
            HomeRoute()
        }

        composable(route = "GitHub") {
            GitHubRoute()
        }

        composable(route = "OpenStax") {
            OpenStaxRoute()
        }
    }
}