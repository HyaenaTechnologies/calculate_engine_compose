package desktop.src.main.kotlin.dev.hyaena_technologies.calculate_engine.desktop

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import lib.src.main.kotlin.dev.hyaena_technologies.calculate_engine.lib.CalculateEngine

fun main(): Unit = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Calculate Engine",
    ) {
        CalculateEngine()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    CalculateEngine()
}