package com.example.testapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.fragments.FragmentRecyclerView
import com.example.testapp.viewholders.MyViewHolder

class MyAdapter(recyclerFragment: FragmentRecyclerView) : RecyclerView.Adapter<MyViewHolder>() {

    private var List = listOf(
        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6",
        "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12",
        "Item 13", "Item 14", "Item 15", "Item 16", "Item 17", "Item 18"
    )

    private var myClickListener: ItemClickListener = recyclerFragment

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.recycler_row, parent, false)
        return MyViewHolder(view, myClickListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val elements = List[position]
        holder.textView.text = elements
    }


    override fun getItemCount(): Int {
        return List.size
    }

    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }
}