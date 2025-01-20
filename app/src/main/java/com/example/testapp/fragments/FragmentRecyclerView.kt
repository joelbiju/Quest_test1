package com.example.testapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.adapters.MyAdapter

class FragmentRecyclerView: Fragment(), MyAdapter.ItemClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recyclerview_fragment, container, false)
    }

    private lateinit var myRecyclerView: RecyclerView
    private var myAdapter: MyAdapter = MyAdapter(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myRecyclerView = view.findViewById(R.id.recyclerview)
        myRecyclerView.layoutManager = LinearLayoutManager(context)
        myRecyclerView.addItemDecoration(DividerItemDecoration(myRecyclerView.context, DividerItemDecoration.VERTICAL))

        myRecyclerView.adapter = myAdapter

    }

    override fun onItemClick(view: View?, position: Int) {
        TODO("Not yet implemented")
    }
}