package com.example.imageapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var spinnerImages: Spinner
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerImages = findViewById(R.id.spinnerImages)
        btnNext = findViewById(R.id.btnNext)

        // Lista de nombres de imágenes
        val imageNames = arrayOf("Image1", "Image2", "Image3")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, imageNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerImages.adapter = adapter

        // Restaurar la selección del spinner si se ha girado el dispositivo
        if (savedInstanceState != null) {
            val selectedPosition = savedInstanceState.getInt("spinner_position")
            spinnerImages.setSelection(selectedPosition)
        }

        btnNext.setOnClickListener {
            val selectedImageName = spinnerImages.selectedItem.toString()

            // Lanzar la segunda actividad con la imagen seleccionada
            val intent = Intent(this, ImageDisplayActivity::class.java)
            intent.putExtra("image_name", selectedImageName)
            startActivity(intent)
        }
    }

    // Guardar la selección del spinner para restaurarla si se rota la pantalla
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("spinner_position", spinnerImages.selectedItemPosition)
    }
}

