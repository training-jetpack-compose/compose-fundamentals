package trainings.mobile.jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import trainings.mobile.jetpackcompose.R.color.colorPrimary
import trainings.mobile.jetpackcompose.R.string.*
import trainings.mobile.jetpackcompose.router.JetFundamentalsRouter.navigateTo
import trainings.mobile.jetpackcompose.router.Screen
import trainings.mobile.jetpackcompose.router.Screen.*

@Composable
fun NavigationScreen() {
    Surface(
        color = White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Center,
            horizontalAlignment = CenterHorizontally
        ) {
            NavigationButton(stringResource(id = text), Text)
            NavigationButton(stringResource(id = text_field), TextField)
            NavigationButton(stringResource(id = buttons), Buttons)
            NavigationButton(stringResource(id = progress_indicators), ProgressIndicator)
            NavigationButton(stringResource(id = alert_dialog), AlertDialog)
        }
    }
}

@Composable
fun NavigationButton(text: String, screen: Screen) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        shape = RoundedCornerShape(4.dp),
        colors = buttonColors(backgroundColor = colorResource(id = colorPrimary)),
        onClick = { navigateTo(screen) }
    ) {
        Text(
            text = text,
            color = White
        )
    }
}