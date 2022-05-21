package com.raywenderlich.android.jetpackcompose.screens

import androidx.compose.runtime.Composable
import com.raywenderlich.android.jetpackcompose.router.BackButtonHandler
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter.navigateTo
import com.raywenderlich.android.jetpackcompose.router.Screen.Navigation


@Composable
fun AlertDialogScreen() {
    MyAlertDialog()
    BackButtonHandler { navigateTo(Navigation) }
}

@Composable
fun MyAlertDialog() {
    //TODO add your code here
}