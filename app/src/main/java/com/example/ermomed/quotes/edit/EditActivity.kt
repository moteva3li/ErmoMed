package com.example.ermomed.quotes.edit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ermomed.edit.BackgroundFragment
import com.example.ermomed.edit.CategoryFragment
import com.example.ermomed.edit.FontFragment
import com.example.ermomed.R
import com.example.ermomed.databinding.ActivityEditBinding


class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.edittabLayout.itemIconTintList = null
        supportFragmentManager.beginTransaction().replace(
            binding.editviewPager.id, CategoryFragment()
        ).commit()

        binding.edittabLayout.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.category -> {
                    supportFragmentManager.beginTransaction().replace(
                        binding.editviewPager.id, CategoryFragment()
                    ).commit()
                }
                R.id.background -> {
                    supportFragmentManager.beginTransaction().replace(
                        binding.editviewPager.id, BackgroundFragment()
                    ).commit()
                }
                R.id.font -> {
                    supportFragmentManager.beginTransaction().replace(
                        binding.editviewPager.id, FontFragment()
                    ).commit()
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}