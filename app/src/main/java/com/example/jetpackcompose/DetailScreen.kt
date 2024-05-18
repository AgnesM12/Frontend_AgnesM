import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailScreen(navController: NavController, itemId: Int) {
    Scaffold(
        topBar = {
            TopAppBar( {AppTopBar(navController = navController, title = "Detail",showBackButton = true)})
        },
        content = {
            DetailContent(navController = navController, itemId = itemId)
        }
    )
}

@Composable
fun DetailContent(navController: NavController, itemId: Int) {
    // Dummy data, Anda bisa menggantinya dengan data yang sesuai
    val item = getItemById(itemId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tampilkan gambar (menggunakan placeholder untuk contoh)
         Image(
             painter = painterResource(id = R.drawable.logo_poltek),
             contentDescription = "Item Image",
             modifier = Modifier
                 .fillMaxWidth()
                 .height(200.dp)
         )

        // Tampilkan data lengkap sesuai dengan item yang dipilih
        Text(text = "Nama: ${item.name}")
        Text(text = "Deskripsi: ${item.description}")
        Text(text = "Total Harga: ${item.price}")
        Text(text = "Stok: ${item.stock}")


        }
    }


// Fungsi dummy untuk mendapatkan item berdasarkan ID (contoh)
fun getItemById(itemId: Int): Item {
    // Implementasi pengambilan data dari sumber data Anda (misalnya database, API, dll.)
    // Di sini, kita akan menggunakan dummy data untuk contoh
    return Item(itemId, "Item $itemId", "Deskripsi Item $itemId", itemId * 10000, itemId * 5)
}

// Data class untuk representasi item
data class Item(
    val id: Int,
    val name: String,
    val description: String,
    val price: Int,
    val stock: Int
)
