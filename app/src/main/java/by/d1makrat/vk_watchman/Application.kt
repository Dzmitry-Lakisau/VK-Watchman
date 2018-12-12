package by.d1makrat.vk_watchman.ui

import android.app.Application
import com.vk.sdk.VKSdk

class Application: Application() {

    override fun onCreate() {
        super.onCreate()

        VKSdk.initialize(this)
    }
}
