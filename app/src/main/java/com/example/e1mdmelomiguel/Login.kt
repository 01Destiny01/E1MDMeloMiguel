package com.example.e1mdmelomiguel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Process
import com.example.e1mdmelomiguel.databinding.ActivityBienvenidoBinding
import com.example.e1mdmelomiguel.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var binding1: ActivityBienvenidoBinding
    var intentos = 0;
    var usuarios: MutableList<Usuario> = mutableListOf(
        Usuario(
            "miguel", "miguel", "miguel"
        ), Usuario("123", "123", "123")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding1 = ActivityBienvenidoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEntrarLogin.setOnClickListener {

            var existe = comprobarUsuario()
            if (existe) {

            } else intentos++
            if (intentos >= 3) {
                Process.killProcess(Process.myPid())
                finish()
            }

        }
        binding.volver.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))


        }

    }

    fun comprobarUsuario(): Boolean {
        var x = 0;
        var existe = false
        while (x < usuarios.size) {
            if (usuarios[x]?.usu.toString().equals(binding?.usuariotxt?.text.toString()) && usuarios[x].pass.equals(binding?.usuariotxt?.text.toString())
            ) {
                startActivity(Intent(this, Bienvenido::class.java))
                existe = true
            } else existe = false
            x++
        }
        return existe

    }
}