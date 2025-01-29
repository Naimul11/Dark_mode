package com.nis.first

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick : Button
    private lateinit var textfile : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textfile = findViewById(R.id.text1)
        buttonClick = findViewById(R.id.button)

        buttonClick.setOnClickListener {
            textfile.setTextColor(Color.MAGENTA)
            textfile.text = "Color is changed"
            buttonClick.text = "White"
            buttonClick.setBackgroundColor(Color.RED)
        }



    }
}