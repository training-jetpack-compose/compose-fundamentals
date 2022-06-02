package jetpackcompose.screens

import androidx.compose.runtime.Composable
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.FundamentalsRouter.navigateTo
import jetpackcompose.router.Screen.Navigation


@Composable
fun AlertDialogScreen() {
    DemoAlertDialog()
    BackButtonHandler { navigateTo(Navigation) }
}

@Composable
fun DemoAlertDialog() {
    //TODO add your code here
}