package com.gastos_viagem.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etx_distancia = findViewById<EditText>(R.id.etx_distancia)
        val etx_preco = findViewById<EditText>(R.id.etx_preco)
        val etx_autonomia = findViewById<EditText>(R.id.etx_autonomia)
        val etx_resultado = findViewById<TextView>(R.id.txt_resultado)
        val btn_botaoCalcular = findViewById<Button>(R.id.btn_botaoCalcular)
        val txt_alerta = findViewById<TextView>(R.id.txt_alerta)



        btn_botaoCalcular.setOnClickListener{
            val distancia = etx_distancia.text.toString().toDouble()
            val precoGasolina = etx_preco.text.toString().toDouble()
            val autonomia = etx_autonomia.text.toString().toDouble()

            val custo = (distancia * precoGasolina)/autonomia

            //etx_resultado.text = "R$: " + String.format("%.2f", custo)

            val resultadoIntent = Intent(this, activity_resultado::class.java)


            resultadoIntent.putExtra("result", custo)

            startActivity(resultadoIntent)
        }
    }
}