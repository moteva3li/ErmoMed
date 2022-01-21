package com.example.ermomed.edit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R
import com.example.ermomed.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = ArrayList<CategoryOptionClass>()

        items.add(CategoryOptionClass(R.drawable.posetivethought ,"Posetive thought"))
        items.add(CategoryOptionClass(R.drawable.famousquotes ,"Famous quotes"))

        val recycler : RecyclerView = binding.categoryrecycler
        val adapter = MyCategoryRecyclerViewadapter(items,context?.applicationContext!!)


        recycler.layoutManager = GridLayoutManager(context?.applicationContext,1)
        recycler.adapter = adapter
    }
}