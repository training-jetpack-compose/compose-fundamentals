package trainings.mobile.jetpackcompose.screens

import androidx.compose.runtime.Composable
import trainings.mobile.jetpackcompose.router.BackButtonHandler
import trainings.mobile.jetpackcompose.router.JetFundamentalsRouter.navigateTo
import trainings.mobile.jetpackcompose.router.Screen.Navigation


@Composable
fun AlertDialogScreen() {
    MyAlertDialog()
    BackButtonHandler { navigateTo(Navigation) }
}

@Composable
fun MyAlertDialog() {
    //TODO add your code here
}