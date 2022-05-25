package jetpackcompose.screens


import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.JetFundamentalsRouter.navigateTo
import jetpackcompose.router.Screen.Navigation

@Composable
fun TextFieldScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ) { MyTextField() }

    BackButtonHandler { navigateTo(Navigation) }
}

@Composable
fun MyTextField() {
    //TODO add your code here
}