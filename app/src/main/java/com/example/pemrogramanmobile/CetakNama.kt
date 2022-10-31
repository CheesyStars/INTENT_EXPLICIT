package com.example.pemrogramanmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CetakNama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cetak_nama)

        var sayHello: TextView = findViewById(R.id.tv_halo)
        var editName: EditText = findViewById(R.id.edt_name)
        var editNim: EditText = findViewById(R.id.edt_nim)
        var editProdi: EditText = findViewById(R.id.edt_prodi)
        var btnSubmit: Button = findViewById(R.id.btn_halo)

        btnSubmit.setOnClickListener {
            val name = editName.text.toString()
            val nim = editNim.text.toString()
            val prodi = editProdi.text.toString()
            sayHello.text = """
                Nama    : $name
                NIM     : $nim
                Prodi   : $prodi
                Selamat Datang Di Pemrograman Mobile
            """.trimIndent()

        }
    }
}