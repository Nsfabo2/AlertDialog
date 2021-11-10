package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var Activity2TV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text = intent.getStringExtra("text")

        Activity2TV = findViewById(R.id.Activity2TV)
        Activity2TV.text = text

    }
}