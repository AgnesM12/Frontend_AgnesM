import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            AppTopBar(navController = navController, title = "Home")
        },
        content = {
            HomeContent(navController = navController)
        }
    )
}

@Composable
fun HomeContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Lazy Column (10 Buku):")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp) // Tambahkan jarak antar item di sini
        ) {
            items(10) { index ->
                ListItem(index = index + 1, onItemClick = { navigateToDetail(navController, it) })
            }
        }

        Text(text = "Lazy Row (10 Buku):")
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Tambahkan jarak antar item di sini
        ) {
            items(10) { index ->
                ListItem(index = index + 11, onItemClick = { navigateToDetail(navController, it) })
            }
        }
    }
}

@Composable
fun ListItem(index: Int, onItemClick: (Int) -> Unit) {
    Button(onClick = { onItemClick(index) }) {
        Text(text = "Buku $index")
    }
}

fun navigateToDetail(navController: NavController, itemId: Int) {
    // Navigasi ke halaman detail dan mengirimkan ID item
    navController.navigate("DetailScreen/$itemId")
}
