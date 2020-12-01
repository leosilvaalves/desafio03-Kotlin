package br.com.webservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Inicia a nova activity

            startActivity(Intent(this, LoginActivity::class.java))

            // fecha a activity
            finish()
        }, 3000)

    }
}