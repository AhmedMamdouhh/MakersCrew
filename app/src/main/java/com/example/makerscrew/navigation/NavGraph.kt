package com.example.makerscrew.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MainNavGraph() {
    val navController = rememberNavController()
    val context = LocalContext.current
    NavHost(
        modifier = Modifier.semantics { testTagsAsResourceId = true },
        navController = navController,
        startDestination = Screen.Splash.route,
    ) {
        composable(
            route = Screen.Splash.route
        ) {

        }

    }
}