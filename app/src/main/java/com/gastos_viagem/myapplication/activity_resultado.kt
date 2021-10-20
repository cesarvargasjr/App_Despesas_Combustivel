package com.gastos_viagem.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
    }

    override fun onStart() {
        super.onStart()

        val etx_resultado = findViewById<TextView>(R.id.txt_resultado)

        val custo = intent.extras?.getDouble("result")

        etx_resultado.text = "R$: " + String.format("%.2f", custo)

    }
}
