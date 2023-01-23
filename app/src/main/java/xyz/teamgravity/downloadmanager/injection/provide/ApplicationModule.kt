package xyz.teamgravity.downloadmanager.injection.provide

import android.app.Application
import android.app.DownloadManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.teamgravity.downloadmanager.core.util.Downloader
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideDownloadManager(application: Application): DownloadManager = application.getSystemService(DownloadManager::class.java)

    @Provides
    @Singleton
    fun provideDownloader(downloadManager: DownloadManager): Downloader = Downloader(downloadManager)
}