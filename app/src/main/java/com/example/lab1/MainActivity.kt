package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList = mutableListOf<String>()
        val adapter = RvAdapter(itemList)
        binding.buttonId.setOnClickListener {
            itemList.add(binding.plainTextInput.text.toString())
            adapter.notifyDataSetChanged()
        }
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(this)

    }

}