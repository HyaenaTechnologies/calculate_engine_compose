package app.src.main.kotlin.dev.hyaena_technologies.calculate_engine

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.src.main.kotlin.dev.hyaena_technologies.calculate_engine.theme.CalculateEngineTheme
import app.src.main.kotlin.dev.hyaena_technologies.calculate_engine.widgets.HomeRoute

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateEngineTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    HomeRoute()
                }
            }       
        }
    }
}