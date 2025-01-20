package com.example.testapp.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.adapters.MyAdapter

class MyViewHolder(itemView: View, myClickListener: MyAdapter.ItemClickListener): RecyclerView.ViewHolder(itemView) {
    val textView:TextView = itemView.findViewById(R.id.textViewRow)
}