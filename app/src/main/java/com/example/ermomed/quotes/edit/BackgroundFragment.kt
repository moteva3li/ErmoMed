package com.example.ermomed.edit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R
import com.example.ermomed.databinding.FragmentBackgroundBinding


class BackgroundFragment : Fragment() {
    private var _binding: FragmentBackgroundBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBackgroundBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = ArrayList<BackgroundOptionClass>()

        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))
        items.add(BackgroundOptionClass(R.drawable.gradient_bg))

        val recycler : RecyclerView = binding.backgroundrecycler
        val adapter = MyBackgroundRecyclerViewAdapter(items,context?.applicationContext!!)


        recycler.layoutManager = GridLayoutManager(context?.applicationContext,3)
        recycler.adapter = adapter
    }
}