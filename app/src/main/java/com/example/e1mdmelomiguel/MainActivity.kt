package com.example.e1mdmelomiguel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.e1mdmelomiguel.databinding.ActivityMainBinding
import com.bumptech.glide.Glide as Glide

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intentL = Intent(this, Login::class.java)
        val intentA = Intent(this, Autor::class.java)

        Glide.with(this)
            .load("https://todomaquetas.es/3696-large_default/solido-1803404-porsche-911-964-turbo-36-black-1993-escala-118.jpg")
            .into(binding.imageView);
        binding.btnAutor.setOnClickListener{
            startActivity(intentA)
            finish()
        }
        binding.btnContinuar.setOnClickListener{
            startActivity(intentL)
            finish()



        }
    }
}