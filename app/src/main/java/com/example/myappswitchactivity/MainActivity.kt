package com.example.myappswitchactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myappswitchactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCounter.setOnClickListener{
            counter++
            binding.tvCounter.text = counter.toString()
        }

        binding.buttonResult.setOnClickListener{
            val numberFromFirstActivity = Intent(this, MainActivity2 ::class.java)
            numberFromFirstActivity.putExtra("COUNTER", counter)
            startActivity(numberFromFirstActivity)
        }
    }
}