package com.example.diego.objective

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        /* pruebilla
        val objetoIntent: Intent = intent
        var NombreUsuarioo = objetoIntent.getStringExtra("NombreUsuario")
        tvinfoProy2.setText("Holii $NombreUsuarioo")*/
    }

    fun nActFourth(view : View)
    {

        var nombreProyecto = etInfoProy3.text.toString()
        var infoProyecto = etInfoProy4.text.toString()
        var inspiracionProyecto = etInfoProy5.text.toString()
        val nA = Intent(this, MultipleChoice::class.java)
        nA.putExtra("NombreProyecto", nombreProyecto)
        nA.putExtra("InfoProyecto", infoProyecto)
        nA.putExtra("InspiracionProyecto", inspiracionProyecto)
        startActivity(nA)
    }
}
