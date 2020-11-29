package com.ambient.gameday.app.ui.screens.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ambient.gameday.R
import com.ambient.gameday.app.commons.others.Status
import com.ambient.gameday.app.ui.base.BaseFragment
import com.ambient.gameday.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override val viewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener { validateInputData() }
        observeLiveData()
    }

    private fun validateInputData() {
        viewModel.validate(
            binding.userEmail.text.toString(),
            binding.userPassword.text.toString()
        )
    }

    private fun observeLiveData() {

        viewModel.validationResult.observe(viewLifecycleOwner, {

            it.getContentIfNotHandled()?.let { response ->
                when (response.status) {
                    Status.SUCCESS -> loginUser()
                    else -> response.message?.let { message ->
                        toast(message)
                    }
                }
            }
        })
    }

    private fun loginUser() {
        viewModel.login(
            binding.userEmail.text.toString(),
            binding.userPassword.text.toString()
        )
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentLoginBinding.inflate(inflater, container, false)
}