package com.example.recycleviewnewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private var items: ArrayList<String>, private var listner:click) : RecyclerView.Adapter<ItemView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemView {
       var view=LayoutInflater.from(parent.context).inflate(R.layout.recycleview,parent,false)
       var viewHolder =ItemView(view)
        view.setOnClickListener {
            listner.clickItem(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
      return  items.size
    }

    override fun onBindViewHolder(holder: ItemView, position: Int) {
      var currentItem=items[position]
        holder.textView.text=currentItem
    }

}


class ItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView : TextView= itemView.findViewById(R.id.textShow)
}

interface click{
    fun clickItem(item:String)
}