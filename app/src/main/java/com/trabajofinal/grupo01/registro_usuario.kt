package com.trabajofinal.grupo01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registro_usuario : AppCompatActivity() {

    private lateinit var btnRegular: Button
    private lateinit var btnMayorista: Button
    private lateinit var btnTransportista: Button
    private lateinit var btnVolver:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        asignarReferencias()
    }

    private fun asignarReferencias(){
        btnTransportista = findViewById(R.id.btnTransportista)
        btnTransportista.setOnClickListener {
            val intent = Intent(this, registro_usuario_parte2::class.java)
            startActivity(intent)
        }

        btnVolver = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}