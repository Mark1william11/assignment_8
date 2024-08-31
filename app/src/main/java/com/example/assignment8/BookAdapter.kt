package com.example.assignment8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter (val books: List<Books>) :RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val tvTitle: TextView = row.findViewById<TextView>(R.id.tv_name)
        val tvAuthor: TextView = row.findViewById<TextView>(R.id.tv_email)
        val ivPhoto: ImageView = row.findViewById<ImageView>(R.id.iv_user)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books.get(position)
        holder.tvTitle.text = book.title
        holder.tvAuthor.text = book.getFormattedAuthor()
        holder.ivPhoto.setImageResource(book.imageResId)
    }
}