package com.vladbystrov.findevent.home.presenter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.databinding.ItemNewsRecyclerViewBinding
import com.vladbystrov.findevent.home.domain.model.News

class NewsAdapter
    (
    private val onItemClickCallback: (News) -> Unit,
)
    : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    private var news = mutableListOf<News>()

    fun setNews(list: List<News>) {
        news.addAll(list)
    }

    class NewsViewHolder(binding: ItemNewsRecyclerViewBinding): RecyclerView.ViewHolder(binding.root) {
        val image = binding.newsImageView
        val name = binding.nameTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemBinding = ItemNewsRecyclerViewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NewsViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        with(holder){
            image.load(news[position].image[0]) {
                placeholder(R.drawable.river)
                transformations(CircleCropTransformation())
            }
            name.text = news[position].name

            itemView.setOnClickListener {
                onItemClickCallback(news[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return news.size
    }
}