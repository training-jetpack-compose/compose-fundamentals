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
fun ExploreButtonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ) {
        DemoButton()
        DemoRadioGroup()
        DemoFloatingActionButton()
        BackButtonHandler { navigateTo(Navigation) }
    }
}

@Composable
fun DemoButton() {
    //TODO add your code here
}

@Composable
fun DemoRadioGroup() {
    //TODO add your code here
}

@Composable
fun DemoFloatingActionButton() {
    //TODO add your code here
}
