import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main(): Unit = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Calculate Engine",
        ) {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}