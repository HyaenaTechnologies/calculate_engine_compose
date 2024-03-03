package ios.src.main.kotlin.dev.hyaena_technologies.calculate_engine.ios

import androidx.compose.ui.window.ComposeUIViewController
import lib.src.main.kotlin.dev.hyaena_technologies.calculate_engine.lib.CalculateEngine
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    CalculateEngine()
}
