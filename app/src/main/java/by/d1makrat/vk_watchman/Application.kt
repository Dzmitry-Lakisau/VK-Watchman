package by.d1makrat.vk_watchman

import android.app.Application
import android.widget.Toast
import com.vk.sdk.VKAccessToken
import com.vk.sdk.VKAccessTokenTracker
import com.vk.sdk.VKSdk

class Application: Application() {

    private val mVkAccessTokenTracker = object : VKAccessTokenTracker() {
        override fun onVKAccessTokenChanged(oldToken: VKAccessToken?, newToken: VKAccessToken?) {
            if (newToken == null) {
                Toast.makeText(applicationContext, "Token is expired", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreate() {
        super.onCreate()

        mVkAccessTokenTracker.startTracking()
        VKSdk.initialize(this)
    }
}
