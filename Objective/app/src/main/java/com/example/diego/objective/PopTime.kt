package com.example.diego.objective

import android.app.DialogFragment
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TimePicker
import kotlinx.android.synthetic.main.pop_time.view.*

/**
 * Created by diego on 18/12/17.
 */
class PopTime: DialogFragment(){


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var myView= inflater!!.inflate(R.layout.pop_time,container,false)


        var buDone=myView.buDone as Button
        var tp1=myView.tp1 as TimePicker

        buDone.setOnClickListener({
            //Code here
            val ma= activity as TimeActivity
            if(Build.VERSION.SDK_INT>=23) {
                ma.SetTime(tp1.hour, tp1.minute)
            }else{
                ma.SetTime(tp1.currentHour, tp1.currentMinute)
            }

            this.dismiss()
        })


        return myView
    }


}