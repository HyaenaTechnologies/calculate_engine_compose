package web.src.main.kotlin.dev.hyaena_technologies.calculate_engine.web

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import lib.src.main.kotlin.dev.hyaena_technologies.calculate_engine.lib.CalculateEngine

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow(canvasElementId = "CalculateEngine") {
        CalculateEngine()
    }
}