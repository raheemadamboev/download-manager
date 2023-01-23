package xyz.teamgravity.downloadmanager.core.receiver

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import xyz.teamgravity.downloadmanager.R

class DownloaderReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == DownloadManager.ACTION_DOWNLOAD_COMPLETE) {
            val id = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
            if (id != -1L) Toast.makeText(context, context?.getString(R.string.download_completed), Toast.LENGTH_SHORT).show()
        }
    }
}