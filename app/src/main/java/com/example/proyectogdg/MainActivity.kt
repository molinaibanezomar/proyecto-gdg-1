package com.example.proyectogdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_button.setOnClickListener {
            counter = counter + 1
            var userName = edit_text_user.text.toString()
            Toast.makeText(this,"Recuerde tomar medicamentos, $userName $counter : Ingresos", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}