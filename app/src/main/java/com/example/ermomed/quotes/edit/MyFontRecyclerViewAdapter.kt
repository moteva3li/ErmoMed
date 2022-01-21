package com.example.ermomed.edit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R

class MyFontRecyclerViewAdapter (data:ArrayList<FontOptionClass>, internal var context: Context) : RecyclerView.Adapter<MyFontRecyclerViewAdapter.ViewHolder>(){


    internal var data : List<FontOptionClass>

    init {
        this.data = data
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layout : View = LayoutInflater.from(context).inflate(R.layout.font_style,parent,false)

        return ViewHolder(layout)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.font.text = data[position].title


    }


    override fun getItemCount(): Int {

        return data.size

    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        internal var font: TextView



        init {

            font = itemView.findViewById(R.id.fontid)


        }


    }


}