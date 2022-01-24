package com.example.phonemodes


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "Landscape or portrait"
        val button1 = findViewById<Button>(R.id.idButton)
        val field = findViewById<EditText>(R.id.idField)
        val text = findViewById<TextView>(R.id.idText)


        button1.setOnClickListener {
                text.text = field.text.toString()
        }


    }
}

