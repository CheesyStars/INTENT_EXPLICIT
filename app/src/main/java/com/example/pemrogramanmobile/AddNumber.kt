package com.example.pemrogramanmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AddNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_number2)

        var result: TextView = findViewById(R.id.tv_counter)
        var addNumber: Button = findViewById(R.id.btn_addNumber)

        addNumber.setOnClickListener {
            var currVal = result.text.toString().toInt()
            var nextVal = currVal + 1
            result.text = "$nextVal"

            if (result.text == "34") {
                result.text = "0"
            }

        }

    }
}