package com.codingblocks.manchestercityplayers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.nameslist.view.*

class PlayerRv(val player:ArrayList<String>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.nameslist,parent,false)
        return playerviewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.playernametv.text = player[position]
    }

    override fun getItemCount(): Int {
        return player.size
    }
    inner class playerviewHolder( itemView: View): RecyclerView.ViewHolder(itemView)

}