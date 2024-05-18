import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                {AppTopBar(navController = navController, title = "Search")}
            )
        },
        content = {
            SearchContent(navController = navController)
        }
    )
}

@Composable
fun SearchContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Lazy Vertical Grid (10 items):")
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp) // Tambahkan padding di sini
        ) {
            items(10) { index ->
                ListItem(index = index + 21, onItemClick = { navigateToDetail(navController, it) })
            }
        }
    }
}
