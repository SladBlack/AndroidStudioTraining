package com.example.lab1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.RecyclerviewItemBinding

class RvAdapter(private val notes: List<String>): RecyclerView.Adapter<RvAdapter.MyViewHolder>() {

    class MyViewHolder(bindingRV: RecyclerviewItemBinding) : RecyclerView.ViewHolder(bindingRV.root){
        private val binding = bindingRV

        fun bind(note: String){
            binding.textView.text = note
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RecyclerviewItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val note = notes[position]
        holder.bind(note)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

}