package com.example.praktikum_05_recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView



class cardMahasiswaAdapter(private val context: Context, private val dataList: List<inisVariable>, val listener: (inisVariable) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.cardmahasiswa_layout, parent, false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val myHolder = holder as MyViewHolder
        myHolder.bindView(dataList[position], listener)
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.card_view)
        val fotomhs = itemView.findViewById<ImageView>(R.id.img_item_photo)
        val namamhs = itemView.findViewById<TextView>(R.id.nama_mahasiswa)
        val nimmhs = itemView.findViewById<TextView>(R.id.nim_mahasiswa)
        val telpon = itemView.findViewById<TextView>(R.id.telp_mahasiswa)
        fun bindView(mhs: inisVariable, listener: (inisVariable) -> Unit) {
            cardView.setOnClickListener {
                listener(mhs)
                val intent = Intent(context, Detail::class.java)
                intent.putExtra("nama_mhs", mhs.namaMhs)
                intent.putExtra("nim_mhs", mhs.nimMhs)
                intent.putExtra("telp_mhs", mhs.telp)
                context.startActivity(intent)
            }
            fotomhs.setImageResource(mhs.fotoMhs)
            namamhs.text = mhs.namaMhs
            nimmhs.text = mhs.nimMhs
            telpon.text = mhs.telp
        }
    }
}