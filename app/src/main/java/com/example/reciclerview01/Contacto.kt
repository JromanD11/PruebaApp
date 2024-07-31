package com.example.reciclerview01

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contacto(
    val nombre: String,
    val apellido: String,
    val telefono: String,
    val foto: String
): Parcelable
