package com.vladbystrov.findevent.search.presentation

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentSearchBinding
import com.vladbystrov.findevent.search.data.MockHomeRepositoryImpl

class SearchFragment: BaseFragment<FragmentSearchBinding>(
    FragmentSearchBinding::inflate
) {

    private val adapter = SearchAdapter(){

    }
    private val repo = MockHomeRepositoryImpl()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.countEventTextView.text = "Всего: 64"
        adapter.setEvents(repo.fetchPopularEvent())
        binding.eventsRecyclerView.layoutManager = GridLayoutManager(requireActivity(),2)
        binding.eventsRecyclerView.adapter = adapter
    }
}