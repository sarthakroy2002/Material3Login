package com.neolit.material3login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mLogin = findViewById<Button>(R.id.Button1)
        val mRegister = findViewById<Button>(R.id.Button2)
        val mUsername = findViewById<TextInputEditText>(R.id.editText1)
        val mPassword = findViewById<TextInputEditText>(R.id.editText2)
        val lUsername = findViewById<TextInputLayout>(R.id.TextInputLayout1)
        val lPassword = findViewById<TextInputLayout>(R.id.TextInputLayout2)
        val username = "sarthakroy2002"
        val password = "1234"

        mRegister.setOnClickListener {
            val iRegister = Intent(this@Login, Register::class.java)
            startActivity(iRegister)
        }

        mLogin.setOnClickListener {
            if (mUsername != null && mPassword != null) {
                if (mUsername.text.toString() == username && mPassword.text.toString() == password) {
                    lUsername.error = null
                    lPassword.error = null
                    Toast.makeText(this, "Welcome " + mUsername.text, Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@Login, MainActivity::class.java))
                } else {
                    if (mUsername.text.toString() != username) {
                        lUsername.error = "Invalid Username"
                    }
                    if (mPassword.text.toString() != password) {
                        lPassword.error = "Invalid Password"
                    }
                }
            }
        }
    }
}