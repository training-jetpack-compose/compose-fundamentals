package jetpackcompose.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import jetpackcompose.router.Screen.Navigation

sealed class Screen {
    object Navigation : Screen()
    object Text : Screen()
    object TextField : Screen()
    object Buttons : Screen()
    object ProgressIndicator : Screen()
    object AlertDialog : Screen()
}

object FundamentalsRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Navigation)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}