package kr.io.sportapp.presentation.view.main

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
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





// 차후에 ViewModel 의 값에 따라 UI State를
// 반영하여 변경이 될 수 있도록
// 변경 이유 ViewModel의 값에 에러가 생겼을 때 나올 페이지를 분리
// 더욱 더 자세한 에러 분기 처리를 하여 안되는 경우를 최소화
// OffLine에서도 가동을 해야 되기 때문에 DataStore UseCase도 준비
// padding은 임시 조치
@Composable
fun MainRouter(paddingValues: PaddingValues) {
    when(paddingValues){
        is PaddingValues -> { MainScreen() }
    }
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


