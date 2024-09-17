package com.example.imageapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ImageDisplayActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_display)

        imageView = findViewById(R.id.imageView)
        btnBack = findViewById(R.id.btnBack)

        // Obtener el nombre de la imagen seleccionada
        val imageName = intent.getStringExtra("image_name")

        // Mostrar la imagen correspondiente
        val imageResId = when (imageName) {
            "Image1" -> R.drawable.image1
            "Image2" -> R.drawable.image2
            "Image3" -> R.drawable.image3
            else -> R.drawable.placeholder // Imagen por defecto
        }
        imageView.setImageResource(imageResId)

        // Volver a la actividad anterior
        btnBack.setOnClickListener {
            finish()
        }
    }
}
