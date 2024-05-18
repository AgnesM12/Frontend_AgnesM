import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                { AppTopBar(navController = navController, title = "Profile") }
            )
        },
        content = {
            ProfileContent()
        }
    )
}

@Composable
fun ProfileContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_poltek),
            contentDescription = "Item Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        ProfileItem(label = "Nama :", value = "Agnes Monika")
        ProfileItem(label = "Email :", value = "agnesmonika0903@gmail.com")
        ProfileItem(label = "Perguruan Tinggi :", value = "Politeknik Negeri Batam")
        ProfileItem(label = "Jurusan :", value = "Teknik Informatika")
    }
}


@Composable
fun ProfileItem(label: String, value: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = label,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 4.dp)
        )
        Text(
            text = value,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(start = 16.dp, top = 4.dp, end = 16.dp, bottom = 8.dp)
        )
    }
}
