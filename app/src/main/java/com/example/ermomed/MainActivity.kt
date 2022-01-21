package com.example.ermomed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ermomed.databinding.ActivityMainBinding
import com.example.ermomed.media.MediaActivity
import com.example.ermomed.quotes.QuotesActivity
import com.example.ermomed.sleep.SleepActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sectionquotes.setOnClickListener {
            startActivity(Intent(this, QuotesActivity::class.java))
        }

        binding.sectionmedia.setOnClickListener {
            startActivity(Intent(this, MediaActivity::class.java))
        }

        binding.sectionsleep.setOnClickListener {
            startActivity(Intent(this, SleepActivity::class.java))
        }

    }
}