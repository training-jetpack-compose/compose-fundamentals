package trainings.jetpack.comppose.fundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import trainings.jetpack.comppose.fundamentals.R.color.purple_700
import trainings.jetpack.comppose.fundamentals.R.string.jetpack_compose
import trainings.jetpack.comppose.fundamentals.ui.theme.TrainingJetPackCompposeFundamentalsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrainingJetPackCompposeFundamentalsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(stringResource(id = jetpack_compose))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hi, $name!",
        fontStyle = Italic,
        color = colorResource(id = purple_700),
        fontSize = 18.sp,
        fontWeight = Bold
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TrainingJetPackCompposeFundamentalsTheme {
        Greeting(stringResource(id = jetpack_compose))
    }
}