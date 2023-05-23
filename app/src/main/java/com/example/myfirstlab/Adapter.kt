package com.example.myfirstlab

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val animalList: ArrayList<AnimalDC>, private val context: Context) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.tv_image)
        val textViewName: TextView = itemView.findViewById(R.id.tv_name)
        val textViewDescShort: TextView = itemView.findViewById(R.id.tv_detail)
        val button: Button = itemView.findViewById(R.id.item_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cards_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = animalList[position]
        holder.imageView.setImageResource(animal.image)
        holder.textViewName.text = animal.name
        holder.textViewDescShort.text = animal.kindOfAnimal

        holder.button.setOnClickListener {
            var passingName = animalList[position].name
            var passingDescFull = animalList[position].kindOfAnimal
            var passingFullDesc = animalList[position].fullDesc

            // Передаємо інформацію на другу Актівіті
            var intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("passingName", passingName)
            intent.putExtra("passingDescFull", passingDescFull)
            intent.putExtra("passingFullDesc", passingFullDesc)

            context.startActivity(intent)
        }
    }


}