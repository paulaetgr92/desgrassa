package com.meu_pacote.myapplicationhellokitty

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TerceiraTelaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terceiratelaactivity)

        val btnVoltar = findViewById<Button>(R.id.button2)
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
