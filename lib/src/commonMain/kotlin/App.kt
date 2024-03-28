import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import theme.CalculateEngineTheme
import widgets.HomeRoute

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