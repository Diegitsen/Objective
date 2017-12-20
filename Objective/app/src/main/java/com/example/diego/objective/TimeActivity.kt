package com.example.diego.objective

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_time.*

class TimeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        val objetoIntent: Intent = intent
        var nombreProyecto = objetoIntent.getStringExtra("NombreProyecto")
        tvTimeInfo.text = "Tu proyecto necesita un horario, es por ello que en base a los" +
                " días y las horas que eligió al comienzo, usted debe de asignar la hora"

        val saveData=SaveData(applicationContext)

        bDia1.text= saveData.getHour().toString() + ":" + saveData.getMinute().toString()
        bDia2.text= saveData.getHour().toString() + ":" + saveData.getMinute().toString()
    }


    fun BuSetTime(view: View){
        val popTime= PopTime()
        val fm=fragmentManager
        popTime.show(fm,"Select time")


    }

    fun SetTime(Hours:Int,Minute:Int){

        bDia1.text= Hours.toString() + ":" + Minute.toString()
        bDia2.text= Hours.toString() + ":" + Minute.toString()

        val saveData=SaveData(applicationContext)
        saveData.SaveData(Hours,Minute)
        saveData.setAlarm()


    }
}
