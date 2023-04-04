package com.zebdul.multiplicationtabel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val bundle:Bundle?=intent.extras

        val number = bundle?.getInt("number")

        var str:String = ""

        val num = findViewById<TextView>(R.id.resultTable)
        if (number != null) {
            for (n in 1..10){
                str += "$number x $n = ${number*n}\n"
            }
            num.text = str
        }
    }
}