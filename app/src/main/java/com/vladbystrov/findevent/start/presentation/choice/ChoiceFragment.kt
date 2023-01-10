package com.vladbystrov.findevent.start.presentation.choice

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.databinding.FragmentChoiceBinding

class ChoiceFragment : BaseFragment<FragmentChoiceBinding>(
    FragmentChoiceBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            registerButton.setOnClickListener {
                view.findNavController().navigate(R.id.action_mainFragment2_to_registerFragment)
            }

            loginButton.setOnClickListener {
                view.findNavController().navigate(R.id.action_mainFragment2_to_loginFragment)
            }
        }
    }

}