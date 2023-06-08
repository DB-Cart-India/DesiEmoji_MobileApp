package com.desiemoji.keyboard

import android.content.Context
import android.os.Build
import androidx.emoji2.bundled.BundledEmojiCompatConfig
import androidx.emoji2.text.EmojiCompat
import com.desiemoji.keyboard.di.koin.databaseModule
import com.desiemoji.keyboard.di.koin.delegateModule
import com.desiemoji.keyboard.di.koin.repositoryModule
import com.desiemoji.keyboard.di.koin.viewModelModule
import com.frogobox.sdk.FrogoKoinApplication
import dagger.hilt.android.HiltAndroidApp
import org.koin.core.KoinApplication
import java.util.*

@HiltAndroidApp
class MainApp : FrogoKoinApplication() {

    companion object {
        val TAG: String = MainApp::class.java.simpleName

        lateinit var instance: MainApp

        fun getContext(): Context = instance.applicationContext

        fun getCurrentLocale(): Locale? {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                instance.resources.configuration.locales[0]
            } else {
                instance.resources.configuration.locale
            }
        }

    }

    override fun setupKoinModule(koinApplication: KoinApplication) {
        koinApplication.modules(
            listOf(
                delegateModule,
                repositoryModule,
                databaseModule,
                viewModelModule,
            )
        )
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        setupEmojiCompat()
    }

    private fun setupEmojiCompat() {
        val config = BundledEmojiCompatConfig(this)
        EmojiCompat.init(config)
    }

}