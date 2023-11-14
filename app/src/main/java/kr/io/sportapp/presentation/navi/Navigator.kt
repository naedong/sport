package kr.io.sportapp.presentation.navi

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kr.io.sportapp.common.item.NavigationItem
import kr.io.sportapp.presentation.view.main.MainRouter

/**
 * sportapp
 * Created by Naedong
 * Date: 2023-11-10(010)
 * Time: 오후 5:15
 */

fun NavGraphBuilder.SportScreen(paddingValues: PaddingValues) {
    composable(
        route = NavigationItem.home.route,
    ){
        MainRouter(paddingValues)
    }
}