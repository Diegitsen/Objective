package com.example.diego.objective

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sixth.*

class SixthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)
    }

    fun nextActivityohyeah(view : View)
    {

        val nextAct = Intent(this, TimeActivity::class.java)
        startActivity(nextAct)
    }
}
