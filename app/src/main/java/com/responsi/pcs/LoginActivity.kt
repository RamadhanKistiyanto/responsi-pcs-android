package com.responsi.pcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login3)

        val btnLogin = findViewById<Button>(R.id.login)
        btnLogin.setOnClickListener {
            val Intent = Intent(this,HomeActivity::class.java)
            startActivity(Intent)
        }
    }
}