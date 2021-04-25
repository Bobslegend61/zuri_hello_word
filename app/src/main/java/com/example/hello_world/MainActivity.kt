package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)

        counterText.text = counter.toString()

        val incBtn = findViewById<Button>(R.id.incBtn)

        incBtn.setOnClickListener {
            counter++
            counterText.text = counter.toString()
        }
    }
}

