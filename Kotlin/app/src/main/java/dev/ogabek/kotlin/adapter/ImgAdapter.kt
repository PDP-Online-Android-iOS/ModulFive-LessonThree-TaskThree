package dev.ogabek.kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Img

class ImgAdapter(private val imgList: List<Img>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ItemViewHolder(view)
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.img)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val img = imgList[position]

        if (holder is ItemViewHolder) {
            holder.img.setImageResource(img.img)
        }
    }

    override fun getItemCount() = imgList.size
}