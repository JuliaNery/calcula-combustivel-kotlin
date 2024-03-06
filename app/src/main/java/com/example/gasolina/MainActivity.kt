package com.example.gasolina

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        //evento botão
        btn.setOnClickListener{view : View?->
            //recebe
            var txtAlcool = findViewById<EditText>(R.id.valAlcool)
            var txtGasolina = findViewById<EditText>(R.id.valGasolina)
            //converte
            var precoAlcool = txtAlcool.text.toString().toDouble()
            var precoGasolina = txtGasolina.text.toString().toDouble()

            var resultado : Double = precoAlcool/precoGasolina
            var mensagem = ""

            if(resultado > 0.7){
                mensagem = "Gasolina"
            }else if(resultado < 0.7 ){
                mensagem = "Alcool"
            }else{
                mensagem = "fodase"
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}