package com.vladbystrov.findevent.home.presenter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentHomeBinding
import com.vladbystrov.findevent.home.presenter.adapter.NewsAdapter
import com.vladbystrov.findevent.home.presenter.adapter.EventAdapter
import com.vladbystrov.findevent.home.domain.model.News
import dagger.hilt.android.AndroidEntryPoint
import omari.hamza.storyview.StoryView
import omari.hamza.storyview.callback.StoryClickListeners
import omari.hamza.storyview.model.MyStory

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(
    FragmentHomeBinding::inflate
) {

    private val viewModel: HomeViewModel by viewModels()

    private val adapterNews = NewsAdapter() {
        setStoryView(it)
    }

    private val adapterToday = EventAdapter() {
        Toast.makeText(requireActivity(), it.image, Toast.LENGTH_SHORT).show()
    }

    private val adapterPopular = EventAdapter() {
        Toast.makeText(requireActivity(), it.image, Toast.LENGTH_SHORT).show()
    }

    private val adapterNewEvent = EventAdapter() {
        Toast.makeText(requireActivity(), it.image, Toast.LENGTH_SHORT).show()
    }

    private val adapterPastEvent = EventAdapter(){

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.loadData()

        viewModel.liveDataNews.observe(viewLifecycleOwner) {
            adapterNews.setNews(it)
        }
        binding.newsRecyclerView.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.newsRecyclerView.adapter = adapterNews

        viewModel.liveDataTodayEvent.observe(viewLifecycleOwner) {
            adapterToday.setEvents(it)
        }

        viewModel.liveDataPopularEvent.observe(viewLifecycleOwner) {
            adapterPopular.setEvents(it)
        }

        viewModel.liveDataNewEvent.observe(viewLifecycleOwner) {
            adapterNewEvent.setEvents(it)
        }

        viewModel.liveDataPastEvent.observe(viewLifecycleOwner) {
            adapterPastEvent.setEvents(it)
        }

        binding.todayRecyclerView.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.todayRecyclerView.adapter = adapterToday

        binding.popularRecyclerView.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.popularRecyclerView.adapter = adapterPopular

        binding.newEventRecyclerView.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.newEventRecyclerView.adapter = adapterNewEvent

        binding.pastEventRecyclerView.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.pastEventRecyclerView.adapter = adapterPastEvent
    }

    private fun setStoryView(news: News) {
        val myStory1 = arrayListOf<MyStory>()
        for (element in news.image) {
            myStory1.add(
                MyStory(
                    element
                )
            )
        }
        StoryView.Builder(parentFragmentManager)
            .setStoriesList(myStory1) // MyStory's ArrayList
            .setStoryDuration(5000)
            .setTitleText(news.name) // StoryViewHeaderInfo's ArrayList
            .setStoryClickListeners(object : StoryClickListeners {
                override fun onDescriptionClickListener(position: Int) {
                    // your action
                }

                override fun onTitleIconClickListener(position: Int) {
                    // your action
                }
            })
            .build()
            .show()
    }


}
