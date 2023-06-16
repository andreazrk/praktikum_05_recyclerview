package com.example.praktikum_05_recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class inisVariable(
    val fotoMhs : Int = 0,
    val namaMhs : String,
    val nimMhs : String,
    val telp : String
) : Parcelable
