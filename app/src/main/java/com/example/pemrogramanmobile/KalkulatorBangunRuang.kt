package com.example.pemrogramanmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KalkulatorBangunRuang : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtSisi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvVolume: TextView
    private lateinit var tvLuas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_bangun_ruang)

        edtSisi = findViewById(R.id.edtSisi)
        tvVolume = findViewById(R.id.tvVolume)
        tvLuas = findViewById(R.id.tvLuas)
        btnHitung = findViewById(R.id.btnHitung)

        btnHitung.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnHitung -> {

                val sisi = edtSisi.text.toString()
                val volume = sisi.toDouble() * sisi.toDouble() * sisi.toDouble()
                val luas = 6 * (sisi.toDouble() * sisi.toDouble())
                tvVolume.text = "$volume"
                tvLuas.text = "$luas"

            }

        }

    }

}