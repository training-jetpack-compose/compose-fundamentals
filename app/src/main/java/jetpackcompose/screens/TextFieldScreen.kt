package jetpackcompose.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.JetFundamentalsRouter.navigateTo
import jetpackcompose.router.Screen
@Composable
fun TextFieldScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) { MyTextField() }

    BackButtonHandler { navigateTo(Screen.Navigation) }
}

@Composable
fun MyTextField() {
    //TODO add your code here
}