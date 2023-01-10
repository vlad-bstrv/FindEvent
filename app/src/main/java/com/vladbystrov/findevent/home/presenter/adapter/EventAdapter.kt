package com.vladbystrov.findevent.home.presenter.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.request.ErrorResult
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.databinding.ItemEventRecyclerViewBinding
import com.vladbystrov.findevent.home.domain.model.Event

class EventAdapter
    (
    private val onItemClickCallback: (Event) -> Unit,
)
    : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    private var events = mutableListOf<Event>()

    fun setEvents(list: List<Event>) {
        events.addAll(list)
    }

    class EventViewHolder(binding: ItemEventRecyclerViewBinding): RecyclerView.ViewHolder(binding.root) {
        val image = binding.backgroundCardView
        val rating = binding.ratingTextView
        val favorites = binding.favoritesImageView
        val share = binding.shareImageView
        val date = binding.dateEventTextView
        val name = binding.nameEventTextView
        val price = binding.priceEventTextView
        val location = binding.locationEventTextView
        val countPeople = binding.countPeopleEventTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val itemBinding = ItemEventRecyclerViewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return EventViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        with(holder){
            image.load(events[position].image) {
                placeholder(R.drawable.river)
                listener(
                    onError = { request: ImageRequest, result: ErrorResult ->
                        Log.e("AAA", "onBindViewHolder: $result", )
                    },
                    onSuccess = { request: ImageRequest, result: SuccessResult ->
                        Log.e("AAA", "onBindViewHolder: $result", )
                    },
                )
            }
            name.text = events[position].name
            rating.text = events[position].rating

            if(events[position].favorites) {
                favorites.setImageResource(R.drawable.ic_favorite)
            } else {
                favorites.setImageResource(R.drawable.ic_favorite_border)
            }

            date.text = events[position].date
            price.text = events[position].price
            location.text = events[position].location
            countPeople.text = "Идут ${events[position].countPeople}"
            //todo дописать иконки, кликлистнер
            itemView.setOnClickListener {
                onItemClickCallback(events[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return events.size
    }
}