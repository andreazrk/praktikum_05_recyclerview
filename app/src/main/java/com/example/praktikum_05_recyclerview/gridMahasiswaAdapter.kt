package com.example.praktikum_05_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class gridMahasiswaAdapter (private val grid_mhs : List<inisVariable>, val listener: (inisVariable) -> Unit) :
    RecyclerView.Adapter<gridMahasiswaAdapter.GridViewHolder>() {
    class GridViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val fotoMhs = view.findViewById<ImageView>(R.id.civ_id_grid)

        //untuk inisialisasi layout manager
        private val LayoutManager = GridLayoutManager(view.context,2)
            fun bindView(grid_mhs: inisVariable, listener: (inisVariable) -> Unit){
                fotoMhs.setImageResource((grid_mhs.fotoMhs))
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.gridmahasiswa_layout, parent, false)
        // create and set the GridLayoutManager with 2 columns
        val layoutManager = GridLayoutManager(parent.context, 2)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int = grid_mhs.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bindView(grid_mhs[position], listener)
    }
}