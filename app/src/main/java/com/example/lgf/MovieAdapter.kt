package com.example.lgf

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MovieAdapter (private val namaList : ArrayList<ItemData>):RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder (ItemData : View) : RecyclerView.ViewHolder (ItemData) {
        val gambar : ImageView = ItemData.findViewById(R.id.imageView2)
        val nama   : TextView = ItemData.findViewById(R.id.idMovie)
        val rilis  : TextView = ItemData.findViewById(R.id.idRilis)
        val genre  : TextView = ItemData.findViewById(R.id.idGenre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val ItemData = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(ItemData)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.rilis.text = currentItem.rilis
        holder.genre.text = currentItem.genre
    }

    override fun getItemCount(): Int = namaList.size
}