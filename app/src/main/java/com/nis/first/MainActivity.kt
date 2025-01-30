package com.nis.first

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick: Button
    private lateinit var textile: TextView
    private lateinit var mode: ConstraintLayout

    private var isDarkMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textile = findViewById(R.id.text1)
        buttonClick = findViewById(R.id.button)
        mode = findViewById(R.id.full)


        textile.setTextColor(Color.BLACK)
        buttonClick.text = "Switch to Dark"
        buttonClick.setBackgroundColor(Color.GRAY)
        mode.setBackgroundColor(Color.WHITE)

        buttonClick.setOnClickListener {

            if (isDarkMode) {
                textile.setTextColor(Color.BLACK)
                textile.text = "Light Mode"
                buttonClick.text = "Switch to Dark"
                buttonClick.setBackgroundColor(Color.GRAY)
                mode.setBackgroundColor(Color.WHITE)
            }

            else {
                textile.setTextColor(Color.MAGENTA)
                textile.text = "Dark Mode"
                buttonClick.text = "Switch to Light"
                buttonClick.setBackgroundColor(Color.RED)
                mode.setBackgroundColor(Color.BLACK)
            }
            isDarkMode = !isDarkMode
        }
    }
}
