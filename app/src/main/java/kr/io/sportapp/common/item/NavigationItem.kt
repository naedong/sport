package kr.io.sportapp.common.item

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * sportapp
 * Created by Naedong
 * Date: 2023-11-10(010)
 * Time: 오후 5:10
 */
sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String ) {
    object home : NavigationItem("home",  Icons.Default.Home,"홈")
}