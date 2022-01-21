package com.example.ermomed.quotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.ermomed.quotes.edit.EditActivity
import com.example.ermomed.databinding.ActivityQuotesBinding

class QuotesActivity : AppCompatActivity() {
    lateinit var binding:ActivityQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = QuotesViewPagerAdapter(
            {

            },{

            }
        )
        binding.quotesviewpager.adapter = adapter
        binding.quotesviewpager.orientation = ViewPager2.ORIENTATION_VERTICAL

        binding.editbutton.setOnClickListener {
            startActivity(Intent(this, EditActivity::class.java))
        }

        binding.textsettingbutton.setOnClickListener {

        }

    }
}