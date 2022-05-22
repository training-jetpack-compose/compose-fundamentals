package trainings.mobile.jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import trainings.mobile.jetpackcompose.router.BackButtonHandler
import trainings.mobile.jetpackcompose.router.JetFundamentalsRouter.navigateTo
import trainings.mobile.jetpackcompose.router.Screen.Navigation

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ) { MyText() }

    BackButtonHandler { navigateTo(Navigation) }
}

@Composable
fun MyText() {
    //TODO add your code here
}