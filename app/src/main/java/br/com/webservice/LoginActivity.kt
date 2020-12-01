package br.com.webservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btn_cadastro.setOnClickListener{
            callRegister()
        }

        btn_login.setOnClickListener {
            callHome()
        }
    }


    fun callRegister(){
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun callHome(){
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}