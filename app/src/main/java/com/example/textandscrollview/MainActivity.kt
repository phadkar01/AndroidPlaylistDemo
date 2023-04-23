package com.example.textandscrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.button1)

        buttonClickMe.setOnClickListener {
            intent = Intent(applicationContext, TextandScrollView::class.java)
            startActivity(intent)
        }
    }
}