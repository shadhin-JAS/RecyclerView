package com.cscomer.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.cscomer.recyclerview.databinding.NameItemBinding


class NameAdapter: ListAdapter<String,NameHolder>(Comparator){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameHolder {
        return NameHolder(NameItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NameHolder, position: Int) {

        getItemId(position).let {

            holder.binding.TextVI.text=getItem(position)

        }

    }

    companion object{

        val Comparator= object :DiffUtil.ItemCallback<String>(){
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem==newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem==newItem
            }


        }
    }


}