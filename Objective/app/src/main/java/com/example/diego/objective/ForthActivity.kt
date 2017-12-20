package com.example.diego.objective

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import org.jetbrains.anko.alert

class ForthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)
    }

    fun nActFifth(view :View)
    {
        val nA = Intent(this, MultipleChoice::class.java)
        startActivity(nA)
       /* alert("pruebita!")
        {
            title="what goin on!"

        }.show()*/


    }
}
