import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack

@Composable
fun AppTopBar(navController: NavController, title: String, showBackButton: Boolean = false) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = if (showBackButton) {
            {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        } else null,
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        elevation = AppBarDefaults.TopAppBarElevation
    )
}
