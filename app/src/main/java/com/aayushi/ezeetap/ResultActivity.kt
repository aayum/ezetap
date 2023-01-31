package com.aayushi.ezeetap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aayushi.ezeetap.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding : ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getIntExtra("result",0)

        binding.result.text = result.toString()

    }


}