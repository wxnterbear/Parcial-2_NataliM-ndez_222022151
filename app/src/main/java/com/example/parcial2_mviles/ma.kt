package com.example.parcial2_mviles

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ma : AppCompatActivity() {

    val i = intent
    private lateinit var name: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ma)

        name = findViewById(R.id.id_nom2)
        val nomb = intent.getStringExtra("nombre")

        name.text = "Hola " + i.getStringExtra("name")
    }
}