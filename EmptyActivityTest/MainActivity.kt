package com.example.emptyactivitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton: Button = findViewById(R.id.addButton)
        val textView: TextView = findViewById(R.id.textView)
        val subButton: Button = findViewById(R.id.subButton)

        addButton.setOnClickListener {
            var count = textView.text.toString().toInt()
            count++
            textView.text = count.toString()
        }

        subButton.setOnClickListener {
            var count: Int = textView.text.toString().toInt()
            count--
            textView.text = count.toString()
        }

    }
}