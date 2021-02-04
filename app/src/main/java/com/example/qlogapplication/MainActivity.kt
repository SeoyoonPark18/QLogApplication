package com.example.qlogapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edtLoginId: EditText
    lateinit var edtLoginPw: EditText
    lateinit var btnLogin: Button
    lateinit var btnToRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtLoginId = findViewById(R.id.edtLoginId)
        edtLoginPw = findViewById(R.id.edtLoginPw)
        btnLogin = findViewById(R.id.btnLogin)
        btnToRegister = findViewById(R.id.btnToRegister)

        btnLogin.setOnClickListener {
            val intent = Intent(this, Pre::class.java)
            startActivity(intent)
        }
        btnToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}