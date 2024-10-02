package com.example.reproductormusica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class AudioAdapter(
    private val audioList: List<AudioItem>,
    private val onItemClick: (AudioItem) -> Unit
) : RecyclerView.Adapter<AudioAdapter.AudioViewHolder>() {

    inner class AudioViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.audioName)
        val imageView: ImageView = view.findViewById(R.id.audioImage)
        val durationTextView: TextView = view.findViewById(R.id.audioDuration)

        fun bind(audioItem: AudioItem) {
            nameTextView.text = audioItem.name
            imageView.setImageResource(audioItem.imageResId)
            durationTextView.text = audioItem.duration
            itemView.setOnClickListener { onItemClick(audioItem) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AudioViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.audio_item, parent, false)
        return AudioViewHolder(view)
    }

    override fun onBindViewHolder(holder: AudioViewHolder, position: Int) {
        holder.bind(audioList[position])
    }

    override fun getItemCount(): Int = audioList.size
}
