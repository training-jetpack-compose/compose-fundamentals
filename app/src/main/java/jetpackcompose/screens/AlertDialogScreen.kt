package jetpackcompose.screens

import androidx.compose.runtime.Composable
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.JetFundamentalsRouter.navigateTo
import jetpackcompose.router.Screen


@Composable
fun AlertDialogScreen() {
    MyAlertDialog()
    BackButtonHandler { navigateTo(Screen.Navigation) }
}

@Composable
fun MyAlertDialog() {
    //TODO add your code here
}