package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Referência para os TextViews e ImageViews
        val velocidadeTexto = findViewById<TextView>(R.id.velocidadeTexto)
        val forçaTexto = findViewById<TextView>(R.id.forçaTexto)
        val magiaTexto = findViewById<TextView>(R.id.magiaTexto)
        val imortalTexto = findViewById<TextView>(R.id.imortalTexto)

        val imagemVelocidade = findViewById<ImageView>(R.id.imageView9)
        val imagemForça = findViewById<ImageView>(R.id.imageView6)
        val imagemMagia = findViewById<ImageView>(R.id.imageView8)
        val imagemImortal = findViewById<ImageView>(R.id.imageView7)

        // Recebendo o poder selecionado da Intent
        val power = intent.getStringExtra("power")

        val btnVoltar = findViewById<Button>(R.id.back)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        // Mostrar o TextView e ImageView apropriados
        when (power) {
            "Velocidade" -> {
                velocidadeTexto.visibility = android.view.View.VISIBLE
                imagemVelocidade.visibility = android.view.View.VISIBLE
            }
            "Força" -> {
                forçaTexto.visibility = android.view.View.VISIBLE
                imagemForça.visibility = android.view.View.VISIBLE
            }
            "Magia" -> {
                magiaTexto.visibility = android.view.View.VISIBLE
                imagemMagia.visibility = android.view.View.VISIBLE
            }
            "Imortal" -> {
                imortalTexto.visibility = android.view.View.VISIBLE
                imagemImortal.visibility = android.view.View.VISIBLE
            }
        }
    }
}
