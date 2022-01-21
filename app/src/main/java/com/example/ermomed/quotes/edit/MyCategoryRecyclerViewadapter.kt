package com.example.ermomed.edit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R

class MyCategoryRecyclerViewadapter (data:ArrayList<CategoryOptionClass>, internal var context: Context) : RecyclerView.Adapter<MyCategoryRecyclerViewadapter.ViewHolder>(){


    internal var data : List<CategoryOptionClass>

    init {
        this.data = data
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layout : View = LayoutInflater.from(context).inflate(R.layout.category_style,parent,false)

        return ViewHolder(layout)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.image.setImageResource(data[position].image)
        holder.title.text = data[position].title


    }


    override fun getItemCount(): Int {

        return data.size

    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        internal var image: ImageView
        internal var title: TextView



        init {

            image = itemView.findViewById(R.id.categoryslot)
            title = itemView.findViewById(R.id.categorytext)


        }


    }


}