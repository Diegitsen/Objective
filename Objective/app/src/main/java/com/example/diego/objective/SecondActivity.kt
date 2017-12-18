package com.example.diego.objective

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sixth.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun nextActivity(view :View)
    {
        var nombreDeUsuario = editText.text.toString()
        val nextAct = Intent(this, ThirdActivity::class.java)
        nextAct.putExtra("NombreUsuario", nombreDeUsuario)
        startActivity(nextAct)
    }
}
