package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referência aos botões
        val btnVelocidade = findViewById<Button>(R.id.Velocidade)
        val btnForça = findViewById<Button>(R.id.força)
        val btnImortal = findViewById<Button>(R.id.Imortal)
        val btnMagia = findViewById<Button>(R.id.Magia)

        // Configurar o clique para cada botão
        btnVelocidade.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("power", "Velocidade")
            startActivity(intent)
        }

        btnForça.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("power", "Força")
            startActivity(intent)
        }

        btnImortal.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("power", "Imortal")
            startActivity(intent)
        }

        btnMagia.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("power", "Magia")
            startActivity(intent)
        }

    }
}
