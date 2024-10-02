package com.example.musicplayer

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AudioPlayerActivity : AppCompatActivity() {

    lateinit var txtAudioName: TextView
    lateinit var btnPlay: Button
    lateinit var btnPause: Button
    lateinit var btnStop: Button
    lateinit var imageView: ImageView

    private var mediaPlayer: MediaPlayer? = null
    private var isPaused = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_player)

        txtAudioName = findViewById(R.id.txtAudioName)
        btnPlay = findViewById(R.id.btnPlay)
        btnPause = findViewById(R.id.btnPause)
        btnStop = findViewById(R.id.btnStop)
        imageView = findViewById(R.id.imageView)

        // Obtener el nombre del audio seleccionado
        val audioName = intent.getStringExtra("audio_name")
        txtAudioName.text = audioName

        // Asignar el recurso de audio correcto
        val audioResId = when (audioName) {
            "Audio1" -> R.raw.audio1
            "Audio2" -> R.raw.audio2
            "Audio3" -> R.raw.audio3
            "Audio4" -> R.raw.audio4
            "Audio5" -> R.raw.audio5
            else -> 0
        }

        // Inicializar MediaPlayer
        mediaPlayer = MediaPlayer.create(this, audioResId)

        btnPlay.setOnClickListener {
            if (isPaused) {
                mediaPlayer?.start() // Reanudar si estaba en pausa
                isPaused = false
            } else {
                mediaPlayer?.seekTo(0) // Reiniciar si estaba detenido
                mediaPlayer?.start()   // Reproducir desde el principio
            }
        }

        btnPause.setOnClickListener {
            if (mediaPlayer?.isPlaying == true) {
                mediaPlayer?.pause()
                isPaused = true
            }
        }

        btnStop.setOnClickListener {
            if (mediaPlayer?.isPlaying == true || isPaused) {
                mediaPlayer?.stop()
                mediaPlayer?.prepare() // Preparar para reproducir de nuevo
                isPaused = false
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
