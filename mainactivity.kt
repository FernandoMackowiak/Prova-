package com.example.verdejar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var plantAdapter: PlantAdapter
    private lateinit var plantList: MutableList<Plant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        plantList = mutableListOf()
        plantAdapter = PlantAdapter(plantList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = plantAdapter

        fab.setOnClickListener {
            val newPlant = Plant("Nova Planta", "01/01/2024", "Médio", 500)
            plantList.add(newPlant)
            plantAdapter.notifyDataSetChanged()
        }
    }
}
