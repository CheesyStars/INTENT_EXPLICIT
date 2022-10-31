package com.example.pemrogramanmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnAddNumber: Button
    private lateinit var btnCetakNama: Button
    private lateinit var btnKalkulatorRuang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnCetakNama = findViewById(R.id.btnCetakNama)
        btnKalkulatorRuang = findViewById(R.id.btnKalkulatorRuang)

        btnAddNumber.setOnClickListener(this)
        btnCetakNama.setOnClickListener(this)
        btnKalkulatorRuang.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnAddNumber -> {
                val intent = Intent(this@MainActivity, AddNumber::class.java)
                startActivity(intent)
            }

            R.id.btnCetakNama -> {
                val intent = Intent(this@MainActivity, CetakNama::class.java)
                startActivity(intent)
            }

            R.id.btnKalkulatorRuang -> {
                val intent = Intent(this@MainActivity, KalkulatorBangunRuang::class.java)
                startActivity(intent)
            }

        }

    }

}