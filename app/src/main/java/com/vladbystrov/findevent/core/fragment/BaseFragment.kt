package com.vladbystrov.findevent.core.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VBinding: ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VBinding
): Fragment() {

    private var _binding: VBinding? = null
    protected val binding get() = _binding as VBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(inflater)
        if(_binding == null)
            throw IllegalArgumentException("Binding cannot be null")
        return binding.root
    }

}