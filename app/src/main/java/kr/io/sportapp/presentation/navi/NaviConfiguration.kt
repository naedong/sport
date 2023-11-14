package kr.io.sportapp.presentation.navi

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import kr.io.sportapp.common.item.NavigationItem

/**
 * sportapp
 * Created by Naedong
 * Date: 2023-11-10(010)
 * Time: 오후 5:18
 */


@Composable
fun NaviConfiguration(
    navHostController: NavHostController,
    paddingValues: PaddingValues,
) {
    NavHost(
        navHostController,
        NavigationItem.home.route
    ) {
        SportScreen(paddingValues)
    }
}