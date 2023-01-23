package xyz.teamgravity.downloadmanager.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import xyz.teamgravity.downloadmanager.R
import xyz.teamgravity.downloadmanager.presentation.viewmodel.MainViewModel

@Composable
fun MainScreen(
    viewmodel: MainViewModel = hiltViewModel(),
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = viewmodel::onDownload) {
            Text(text = stringResource(id = R.string.start_downloading))
        }
    }
}