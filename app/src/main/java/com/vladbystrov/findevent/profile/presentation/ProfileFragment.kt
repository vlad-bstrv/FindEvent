package com.vladbystrov.findevent.profile.presentation

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import coil.load
import coil.transform.CircleCropTransformation
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentProfileBinding
import com.vladbystrov.findevent.profile.domain.model.Profile

class ProfileFragment : BaseFragment<FragmentProfileBinding>(
    FragmentProfileBinding::inflate
) {

    private val profile = Profile(
        "https://sun9-59.userapi.com/impg/tfISQgFTdMMDUSEr8QPM00mgIGt6dLoRqn5-Ng/F_Vkwaew13Q.jpg?size=1512x1890&quality=95&sign=78e63456028288ab01bc6817963d3d33&type=album",
        "Владислав",
        "keocer@gmail.com"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHeader(profile)

    }

    private fun setHeader(profile: Profile) {
        binding.apply {
            avatarImageView.load(profile.avatar) {
                transformations(CircleCropTransformation())
            }
            nameUserTextView.text = profile.username
            emailTextView.text = profile.email
        }


    }
}