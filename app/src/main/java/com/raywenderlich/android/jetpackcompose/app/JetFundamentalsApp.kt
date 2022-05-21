package com.raywenderlich.android.jetpackcompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter.currentScreen
import com.raywenderlich.android.jetpackcompose.router.Screen.*
import com.raywenderlich.android.jetpackcompose.screens.*

@Composable
fun JetFundamentalsApp() {
    Surface(color = colors.background) {
        Crossfade(targetState = currentScreen) { screenState ->
            when (screenState.value) {
                is Navigation -> NavigationScreen()
                is Text -> TextScreen()
                is TextField -> TextFieldScreen()
                is Buttons -> ExploreButtonsScreen()
                is ProgressIndicator -> ProgressIndicatorScreen()
                is AlertDialog -> AlertDialogScreen()
            }
        }
    }
}