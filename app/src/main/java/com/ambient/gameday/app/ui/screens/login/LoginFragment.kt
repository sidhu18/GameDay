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
import com.ambient.gameday.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

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
            when (it.getContentIfNotHandled()?.status) {

                Status.SUCCESS -> loginUser()

                else -> Toast.makeText(
                    context,
                    it.getContentIfNotHandled()?.message,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }

    private fun loginUser() {
        viewModel.login(
            binding.userEmail.text.toString(),
            binding.userPassword.text.toString()
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}