package com.example.ermomed.quotes

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R


class QuotesViewPagerAdapter(
    private val onOtherOptinClick:() -> Unit,
    private val onLikeClick: () -> Unit
) : RecyclerView.Adapter<PagerEM>() {

    private val list : List<String> = listOf(
        "I am breathing slowly and calmly.",
        "I choose to feel at peace today.",
        "I will overcome stress.",
        "My mind is quiet and calm.",
        "I am strong and will get through this.",
        "I will be okay if I experience anxiety.",
        "I deserve peace."
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerEM {
        Log.d("heyhey"," I am here 1")
        return PagerEM(LayoutInflater.from(parent.context).inflate(R.layout.quotes_page_style, parent, false))

    }


    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: PagerEM, position: Int) {

        holder.tvAbout.text = list[position]

        holder.otherOption.setOnClickListener {
            onOtherOptinClick.invoke()
        }

        holder.like.setOnClickListener {
            onLikeClick.invoke()
        }

    }
}

class PagerEM(itemView: View) : RecyclerView.ViewHolder(itemView){
    var tvAbout = itemView.findViewById<TextView>(R.id.page_text)
    var like = itemView.findViewById<ImageView>(R.id.like)
    var otherOption = itemView.findViewById<ImageView>(R.id.otheroptins)
}