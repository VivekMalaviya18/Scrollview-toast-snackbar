package com.myproject.mad_scrollview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val myTxtView = findViewById<TextView>(R.id.txt_sig)
        myTxtView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btn: Button = findViewById(R.id.btn_reg)
        btn.setOnClickListener {
            showSnackbar()
        }
    }

    private fun showSnackbar() {
        val rootView = findViewById<View>(android.R.id.content)
        Snackbar.make(rootView, "Registration Successful", Snackbar.LENGTH_SHORT).show()
    }


}