package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var spinnerAudios: Spinner
    lateinit var btnSelect: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAudios = findViewById(R.id.spinnerAudios)
        btnSelect = findViewById(R.id.btnSelect)

        // Lista de nombres de audios
        val audioNames = arrayOf("Audio1", "Audio2", "Audio3", "Audio4", "Audio5")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, audioNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerAudios.adapter = adapter

        btnSelect.setOnClickListener {
            val selectedAudio = spinnerAudios.selectedItem.toString()

            // Enviar el nombre del audio seleccionado a la segunda actividad
            val intent = Intent(this, AudioPlayerActivity::class.java)
            intent.putExtra("audio_name", selectedAudio)
            startActivity(intent)
        }
    }
}
