package dev.android.bruno.meuappstreaming

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed({

            val intent = Intent(this,
                MainActivity::class.java)

            startActivity(intent)
            finish()


        }, 10000)

    }
}