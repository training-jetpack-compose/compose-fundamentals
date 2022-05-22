package com.raywenderlich.android.jetpackcompose.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

/**
 * Class defining the screens we have in the app.
 *
 * These objects should match files we have in the screens package
 */
sealed class Screen {
  object Navigation : Screen()
  object Text : Screen()
  object TextField : Screen()
  object Buttons : Screen()
  object ProgressIndicator : Screen()
  object AlertDialog : Screen()
}

object JetFundamentalsRouter {
  var currentScreen: MutableState<Screen> = mutableStateOf(Screen.Navigation)

  fun navigateTo(destination: Screen) {
    currentScreen.value = destination
  }
}