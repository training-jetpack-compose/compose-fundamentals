package jetpackcompose.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import jetpackcompose.R
import jetpackcompose.router.Screen.Navigation


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

    val screens: Array<Pair<Int, Screen>> = arrayOf(
        Pair(R.string.text, Screen.Text),
        Pair(R.string.text_field, Screen.TextField),
        Pair(R.string.buttons, Screen.Buttons),
        Pair(R.string.progress_indicators, Screen.ProgressIndicator),
        Pair(R.string.alert_dialog, Screen.AlertDialog),
    )

    var currentScreen: MutableState<Screen> = mutableStateOf(Navigation)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}