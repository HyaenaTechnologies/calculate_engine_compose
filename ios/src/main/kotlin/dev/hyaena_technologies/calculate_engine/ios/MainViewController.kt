package dev.hyaena_technologies.calculate_engine

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    CalculateEngine()
}
