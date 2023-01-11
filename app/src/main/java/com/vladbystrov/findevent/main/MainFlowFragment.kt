package com.vladbystrov.findevent.main

import androidx.navigation.ui.setupWithNavController
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.core.fragment.BaseFlowFragment
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentMainFlowBinding

class MainFlowFragment: BaseFlowFragment<FragmentMainFlowBinding>(
    R.id.nav_host_fragment_main,
    FragmentMainFlowBinding::inflate
) {

    override fun setupNavigation() {
        binding.bottomNavigation.setupWithNavController(navController)
    }
}