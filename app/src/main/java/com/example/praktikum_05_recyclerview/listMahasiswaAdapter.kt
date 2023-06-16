package com.example.praktikum_05_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class listMahasiswaAdapter (private val context: Context, private val idol: List<inisVariable>, val listener: (inisVariable) -> Unit) :
    RecyclerView.Adapter<listMahasiswaAdapter.ListViewHolder>() {

    class ListViewHolder(view: View) :RecyclerView.ViewHolder(view)
    {
        val fotomhs = view.findViewById<ImageView>(R.id.img_item_photo)
        val namamhs = view.findViewById<TextView>(R.id.nama_mahasiswa)
        val nimmhs = view.findViewById<TextView>(R.id.nim_mahasiswa)
        val telpon = view.findViewById<TextView>(R.id.telp_mahasiswa)
        fun bindView( mhs: inisVariable, listener: (inisVariable) -> Unit) {
            fotomhs.setImageResource(mhs.fotoMhs)
            namamhs.text = mhs.namaMhs
            nimmhs.text = mhs.nimMhs
            telpon.text = mhs.telp
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(

            LayoutInflater.from(context).inflate(R.layout.listmahasiswa_layout,
                parent, false)
        )
    }
    override fun getItemCount(): Int = idol.size
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindView(idol[position], listener)
    }
}
