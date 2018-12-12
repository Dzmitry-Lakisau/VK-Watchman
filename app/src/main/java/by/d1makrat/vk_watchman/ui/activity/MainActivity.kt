package by.d1makrat.vk_watchman.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import by.d1makrat.vk_watchman.R
import by.d1makrat.vk_watchman.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
