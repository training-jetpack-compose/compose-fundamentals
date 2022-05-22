package com.raywenderlich.android.jetpackcompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter
import com.raywenderlich.android.jetpackcompose.router.Screen
import com.raywenderlich.android.jetpackcompose.screens.*

@Composable
fun JetFundamentalsApp() {
  Surface(color = MaterialTheme.colors.background) {
    Crossfade(targetState = JetFundamentalsRouter.currentScreen) { screenState ->
      when (screenState.value) {
        is Screen.Navigation -> NavigationScreen()
        is Screen.Text -> TextScreen()
        is Screen.TextField -> TextFieldScreen()
        is Screen.Buttons -> ExploreButtonsScreen()
        is Screen.ProgressIndicator -> ProgressIndicatorScreen()
        is Screen.AlertDialog -> AlertDialogScreen()
      }
    }
  }
}