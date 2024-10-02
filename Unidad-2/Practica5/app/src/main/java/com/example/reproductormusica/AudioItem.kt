package com.example.reproductormusica

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AudioItem(
    val name: String,
    val imageResId: Int,
    val duration: String,
    val audioResId: Int
) : Parcelable
