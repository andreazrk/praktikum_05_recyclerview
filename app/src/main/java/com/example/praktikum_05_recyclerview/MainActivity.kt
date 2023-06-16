package com.example.praktikum_05_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val dataMahasiswa = listOf<inisVariable>(
        inisVariable(
            R.drawable.liam,
            namaMhs = "Liam",
            nimMhs = "20102021",
            telp = "082227229222"
        ),
        inisVariable(
            R.drawable.noel,
            namaMhs = "Noel",
            nimMhs = "20102022",
            telp = "082227229223"
        ),
        inisVariable(
            R.drawable.paularthur,
            namaMhs = "Paul Arthurs",
            nimMhs = "20102023",
            telp = "082227229224"
        ),
        inisVariable(
            R.drawable.paulmccuigan,
            namaMhs = "Paul McCuigan",
            nimMhs = "20102022",
            telp = "082227229223"
        ),
        inisVariable(
            R.drawable.noel,
            namaMhs = "Noel",
            nimMhs = "20102022",
            telp = "082227229223"
        ),
        inisVariable(
            R.drawable.liam,
            namaMhs = "Liam",
            nimMhs = "20102021",
            telp = "082227229222"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_mahasiswa)
        recyclerView.setHasFixedSize(true)

//        ShowlistMahasiswa()
//        ShowGridMahasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = cardMahasiswaAdapter(this, dataMahasiswa){}
        recyclerView.adapter = adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter = gridMahasiswaAdapter(grid_mhs = dataMahasiswa){

        }
        val recyclerView = findViewById<RecyclerView>(R.id.Rv_mahasiswa)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = gridMahasiswaAdapter(dataMahasiswa){

        }
    }

    private fun ShowlistMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = listMahasiswaAdapter(this, dataMahasiswa){
        }
    }
}