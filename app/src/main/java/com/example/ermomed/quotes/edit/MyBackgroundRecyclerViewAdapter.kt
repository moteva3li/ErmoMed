package com.example.ermomed.edit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R

class MyBackgroundRecyclerViewAdapter (data:ArrayList<BackgroundOptionClass>, internal var context: Context) : RecyclerView.Adapter<MyBackgroundRecyclerViewAdapter.ViewHolder>(){


    internal var data : List<BackgroundOptionClass>

    init {
        this.data = data
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layout : View = LayoutInflater.from(context).inflate(R.layout.background_style,parent,false)

        return ViewHolder(layout)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.image.setImageResource(data[position].image)


    }


    override fun getItemCount(): Int {

        return data.size

    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        internal var image: ImageView


        init {

            image = itemView.findViewById(R.id.backgroundslot)

        }


    }


}