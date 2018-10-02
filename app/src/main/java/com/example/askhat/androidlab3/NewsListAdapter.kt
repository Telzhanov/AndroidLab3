package com.example.askhat.androidlab3

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*

class NewsListAdapter(var news:ArrayList<News>,var context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false))
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.postTitle.text = news[position].title
        holder.itemView.postDate.text = news[position].date
        holder.itemView.setOnClickListener {
            val intent = Intent(context,NewsInfoActivity::class.java)
            intent.putExtra("object",news[position])
            context.startActivity(intent)
        }
    }
    inner class NewsViewHolder(view: View):RecyclerView.ViewHolder(view)
}