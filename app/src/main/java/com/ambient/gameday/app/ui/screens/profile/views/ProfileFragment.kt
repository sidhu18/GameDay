package com.ambient.gameday.app.ui.screens.profile.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ambient.gameday.app.ui.base.BaseFragment
import com.ambient.gameday.data.local.entities.UserEntity
import com.ambient.gameday.databinding.FragmentProfileBinding
import com.bumptech.glide.RequestManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment constructor(
    private val glide: RequestManager
) : BaseFragment<FragmentProfileBinding, ProfileViewModel>() {

    override val viewModel: ProfileViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentProfileBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeData()
    }

    private fun observeData() {
        viewModel.userLiveData.observe(
            viewLifecycleOwner,
            this::setUi
        )
    }

    private fun setUi(userData: UserEntity) {
        binding.apply {
            profileName.text = userData.name
            profileEmail.text = userData.email
            glide.load(
                "https://img.cinemablend.com/filter:scale/quill/b/1/6/d/e/c/b16dec0062b2fddf566c6596500c772dd3fe3408.jpg?"
            ).into(profileImage)
        }
    }
}
