package com.akech.assessement.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.akech.assessement.databinding.ActivityMainBinding
import com.akech.assessement.model.Post
import com.akech.assessement.viewmodel.PostViewModel


class PostAdapter : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

        var data: List<Post> = emptyList() // List of data items

        // Create ViewHolder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemPostBinding.inflate(inflater, parent, false)
            return PostViewHolder(binding)
        }

        // Bind data to ViewHolder
        override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
            val post = data[position]
            holder.bind(post)
        }

        // Return number of items
        override fun getItemCount(): Int {
            return data.size
        }

        // ViewHolder class
        class PostViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(post: Post) {
                binding.titleTextView.text = post.title
                binding.bodyTextView.text = post.body
            }
        }
    }
















