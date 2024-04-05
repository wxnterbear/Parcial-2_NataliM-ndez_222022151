package com.example.parcial2_mviles

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var siguiente: Button
    private lateinit var nombre: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        siguiente = findViewById(R.id.button)
        nombre = findViewById(R.id.idNombre)

        siguiente.setOnClickListener(View.OnClickListener {
            val n = nombre.text.toString().trim { it <= ' ' }
            if (TextUtils.isEmpty(n)) {
                Toast.makeText(
                    this@MainActivity,
                    "No se ha registrado ningun nombre, vuele a intentarlo",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val i = Intent(
                    this@MainActivity,
                    ma::class.java
                )
                i.putExtra("name", n)
                startActivity(i)
            }
        })
    }
}