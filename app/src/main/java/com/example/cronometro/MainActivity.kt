package com.example.cronometro

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        //val editText: EditText = findViewById(R.id.edit_value)
        val buttonStart: Button = findViewById(R.id.btn_start)
        //val buttonStop: Button = findViewById(R.id.btn_stop)
        //val result: TextView = findViewById(R.id.txt_result)

        buttonStart.setOnClickListener{
            Toast.makeText(this, "Teste", Toast.LENGTH_SHORT).show()
        }
    }
}