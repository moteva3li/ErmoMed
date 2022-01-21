package com.example.ermomed.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ermomed.R
import com.example.ermomed.databinding.FragmentFontBinding


class FontFragment : Fragment() {
    private var _binding: FragmentFontBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFontBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = ArrayList<FontOptionClass>()

        items.add(FontOptionClass(R.font.acmeregular,"acmeregular"))
        items.add(FontOptionClass(R.font.quicksandvariablefontwght ,"quicksandvariablefontwght"))

        val recycler : RecyclerView = binding.fontrecycler
        val adapter = MyFontRecyclerViewAdapter(items,context?.applicationContext!!)

        binding.fontrecycler.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
        recycler.layoutManager = GridLayoutManager(context?.applicationContext,1)
        recycler.adapter = adapter
    }
}