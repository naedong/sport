package kr.io.sportapp.presentation.view.main

import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import kr.io.sportapp.presentation.navi.NaviConfiguration
import kr.io.sportapp.ui.theme.SportappTheme

/**
 * sportapp
 * Created by Naedong
 * Date: 2023-11-10(010)
 * Time: 오후 5:10
 */

@Composable
fun MainScreen() {

}

@Composable
fun MainRouter() {

}


@Composable
fun MainSetting() {
    val snackbarHostState = remember { SnackbarHostState() }
    val navController = rememberNavController()

    SportappTheme {
        Scaffold(
            snackbarHost = { SnackbarHost(snackbarHostState) }
        )
        {
            NaviConfiguration(navController, it)
        }
    }
}


