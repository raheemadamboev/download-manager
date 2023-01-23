package xyz.teamgravity.downloadmanager.presentation.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.teamgravity.downloadmanager.core.util.Downloader
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val downloader: Downloader,
) : ViewModel() {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun onDownload() {
        downloader.download("https://live-production.wcms.abc-cdn.net.au/500598a4e1200a81a819db6ad2f7812e?impolicy=wcms_crop_resize&cropH=608&cropW=1080&xPos=0&yPos=1&width=862&height=485")
    }
}