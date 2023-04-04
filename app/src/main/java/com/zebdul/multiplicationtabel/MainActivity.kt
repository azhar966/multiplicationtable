package com.zebdul.multiplicationtabel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNum = findViewById<EditText>(R.id.editTextNumber)
        val showTable = findViewById<Button>(R.id.button)

        showTable.setOnClickListener {
            val number = userNum.text.toString()
            val num = number.toInt()

            val intent = Intent(this, TableActivity::class.java)
            intent.putExtra("number", num)
            startActivity(intent)
        }

    }
}