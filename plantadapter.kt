package com.example.verdejar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlantAdapter(private val plantList: List<Plant>) : RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    class PlantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val plantName: TextView = itemView.findViewById(R.id.plantName)
        val plantDate: TextView = itemView.findViewById(R.id.plantDate)
        val plantCare: TextView = itemView.findViewById(R.id.plantCare)
        val plantWater: TextView = itemView.findViewById(R.id.plantWater)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plant, parent, false)
        return PlantViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val plant = plantList[position]
        holder.plantName.text = plant.name
        holder.plantDate.text = plant.plantingDate
        holder.plantCare.text = plant.careLevel
        holder.plantWater.text = plant.waterAmount.toString()
    }

    override fun getItemCount(): Int {
        return plantList.size
    }
}
