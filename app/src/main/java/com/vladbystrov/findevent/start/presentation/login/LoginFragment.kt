package com.vladbystrov.findevent.start.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentLoginBinding
import com.vladbystrov.findevent.extensions.activityNavController
import com.vladbystrov.findevent.extensions.navigateSafely
import com.vladbystrov.findevent.start.data.UserData


class LoginFragment : BaseFragment<FragmentLoginBinding>(
    FragmentLoginBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.registerButton.setOnClickListener {
//            view.findNavController().currentDestination?.getAction(R.id.mainFlowFragment)?.let { navigate(actionId) }
//            view.findNavController().navigate(R.id.action_global_mainFlowFragment)
            UserData.isAuthorized = true
            activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
        }
    }
}