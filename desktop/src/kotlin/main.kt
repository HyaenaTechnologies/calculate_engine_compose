package dev.hyaena_technologies.calculate_engine

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

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