package jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.FundamentalsRouter.navigateTo
import jetpackcompose.router.Screen.Navigation

@Composable
fun ProgressIndicatorScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ) {
        //TODO add your code here
    }

    BackButtonHandler { navigateTo(Navigation) }
}