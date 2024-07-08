package com.myproject.mad_scrollview

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn_log)
        btn.setOnClickListener {
            val uname: EditText = findViewById(R.id.username)
            val pass: EditText = findViewById(R.id.password)

            if (uname.text.toString() == ("VIVEK") && pass.text.toString() == ("1234")) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }


        val myTextView = findViewById<TextView>(R.id.txt_other)
        myTextView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}
