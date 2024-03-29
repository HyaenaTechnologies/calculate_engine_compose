package dev.hyaena_technologies.calculate_engine

import CalculateEngine
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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