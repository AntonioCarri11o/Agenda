package com.example.agenda.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda.R
import com.example.agenda.model.Element
import java.util.zip.Inflater

class CustomAdapter(val context:Context,val layout:Int,val data:List<Element>):RecyclerView.Adapter<CustomAdapter.ElementViewHolder>() {
    class ElementViewHolder(inflater: LayoutInflater,parent:ViewGroup,layout: Int):
        RecyclerView.ViewHolder(inflater.inflate(layout,parent,false)){
            var icon:ImageView?=null;
            var person:TextView?=null;
        init{
            icon=itemView.findViewById(R.id.iconImgV)
            person=itemView.findViewById(R.id.txtPerson)
        }
        fun bindData(element:Element){
            icon!!.setImageResource(element.iconLetter)
            person!!.text=element.text
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        return ElementViewHolder(inflater,parent,layout)
    }

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {
        val element=data[position]
        holder.bindData(element)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}