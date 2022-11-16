package com.example.e1mdmelomiguel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e1mdmelomiguel.R
import com.example.e1mdmelomiguel.databinding.ActivityBienvenidoBinding


class Bienvenido : AppCompatActivity() {
    private lateinit var  binding : ActivityBienvenidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        binding = ActivityBienvenidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnvolverAmainFb.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))


        }
    }


}