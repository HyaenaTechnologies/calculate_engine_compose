package android.src.main.kotlin.dev.hyaena_technologies.calculate_engine.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import lib.src.main.kotlin.dev.hyaena_technologies.calculate_engine.lib.CalculateEngine

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculateEngine()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    CalculateEngine()
}