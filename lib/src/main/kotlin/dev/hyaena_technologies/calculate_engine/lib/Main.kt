package dev.hyaena_technologies.calculate_engine

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.hyaena_technologies.theme.CalculateEngineTheme
import dev.hyaena_technologies.widgets.HomeRoute

@Composable
fun CalculateEngine() {
    CalculateEngineTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            HomeRoute()
        }
    }
}