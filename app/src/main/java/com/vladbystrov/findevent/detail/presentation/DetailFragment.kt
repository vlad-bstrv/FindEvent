package com.vladbystrov.findevent.detail.presentation


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BaseFragment<FragmentDetailBinding>(
    FragmentDetailBinding::inflate
) {
    private val viewModel: DetailViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}