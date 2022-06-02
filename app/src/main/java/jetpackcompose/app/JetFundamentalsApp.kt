package jetpackcompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import jetpackcompose.router.JetFundamentalsRouter
import jetpackcompose.router.Screen
import jetpackcompose.screens.*

@Composable
fun JetFundamentalsApp() {
    Surface(color = MaterialTheme.colors.background) {
        Crossfade(targetState = JetFundamentalsRouter.currentScreen) { screenState ->
            when (screenState.value) {
                is Screen.Navigation -> NavigationScreen(JetFundamentalsRouter.screens)
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
                is Screen.Buttons -> ExploreButtonsScreen()
                is Screen.ProgressIndicator -> ProgressIndicatorScreen()
                is Screen.AlertDialog -> AlertDialogScreen()
            }
        }
    }
}