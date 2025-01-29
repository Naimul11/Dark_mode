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
    private lateinit var textile : TextView
    private lateinit var mode : ConstraintLayout


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textile = findViewById(R.id.text1)
        buttonClick = findViewById(R.id.button)

        mode = findViewById(R.id.full)

        buttonClick.setOnClickListener {
            textile.setTextColor(Color.MAGENTA)
            textile.text = "Color is changed"
            buttonClick.text = "White"
            buttonClick.setBackgroundColor(Color.RED)
            mode.setBackgroundColor(Color.BLACK)
        }



    }
}