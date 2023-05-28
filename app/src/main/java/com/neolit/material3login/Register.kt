package com.neolit.material3login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val mRegister = findViewById<Button>(R.id.button)
        val mName = findViewById<TextInputEditText>(R.id.name_text)
        val mUsername = findViewById<TextInputEditText>(R.id.username)
        val mPassword = findViewById<TextInputEditText>(R.id.password)
        val mConfirmPassword = findViewById<TextInputEditText>(R.id.confirm_password)

        mRegister.setOnClickListener {
            if (mName != null && mUsername != null) {
                if (mPassword.text.toString() == mConfirmPassword.text.toString()) {
                    Toast.makeText(this, "Registered! Kindly login", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@Register, Login::class.java))
                }
            }
        }
    }
}