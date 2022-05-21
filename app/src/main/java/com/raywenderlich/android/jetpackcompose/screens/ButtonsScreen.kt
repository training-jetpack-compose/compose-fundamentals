package com.raywenderlich.android.jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import com.raywenderlich.android.jetpackcompose.router.BackButtonHandler
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter.navigateTo
import com.raywenderlich.android.jetpackcompose.router.Screen.Navigation

@Composable
fun ExploreButtonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ) {
        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()
        BackButtonHandler { navigateTo(Navigation) }
    }
}

@Composable
fun MyButton() {
    //TODO add your code here
}

@Composable
fun MyRadioGroup() {
    //TODO add your code here
}

@Composable
fun MyFloatingActionButton() {
    //TODO add your code here
}
