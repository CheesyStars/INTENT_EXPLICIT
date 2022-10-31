package com.example.pemrogramanmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class kalkulatorRuang : AppCompatActivity(), View.OnClickListener {

    private lateinit var editWidth: EditText
    private lateinit var editHeight: EditText
    private lateinit var editLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_number)

        editWidth = findViewById(R.id.edt_width)
        editHeight = findViewById(R.id.edt_height)
        editLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnCalculate) {
            val inputLength = editLength.text.toString().trim()
            val inputWidth = editWidth.text.toString().trim()
            val inputHeight = editHeight.text.toString().trim()

            var inputanKosong = false

            if (inputLength.isEmpty()) {
                inputanKosong = true
                editLength.error = "Inputan Ini Tidak Boleh Kosong!"
            }

            if (inputWidth.isEmpty()) {
                inputanKosong = true
                editWidth.error = "Inputan ini Tidak Boleh Kosong"
            }

            if (inputHeight.isEmpty()) {
                inputanKosong = true
                editHeight.error = "Inputan Ini Tidak Boleh Kosong"
            }

            if (!inputanKosong) {
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                tvResult.text = volume.toString()
            }
        }
    }

}