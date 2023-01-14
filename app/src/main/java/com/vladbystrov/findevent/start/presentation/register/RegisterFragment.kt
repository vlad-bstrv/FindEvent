package com.vladbystrov.findevent.start.presentation.register

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.core.AppState
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentRegisterBinding
import com.vladbystrov.findevent.extensions.activityNavController
import com.vladbystrov.findevent.extensions.navigateSafely
import com.vladbystrov.findevent.start.data.UserData
import com.vladbystrov.findevent.start.domain.model.User
import com.vladbystrov.findevent.start.presentation.register.FieldValidators.isStringContainNumber
import com.vladbystrov.findevent.start.presentation.register.FieldValidators.isStringContainSpecialCharacter
import com.vladbystrov.findevent.start.presentation.register.FieldValidators.isStringLowerAndUpperCase
import com.vladbystrov.findevent.start.presentation.register.FieldValidators.isValidEmail
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseFragment<FragmentRegisterBinding>(
    FragmentRegisterBinding::inflate
) {

    private val viewModel: RegisterViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()

        binding.registerButton.setOnClickListener {
            if (isValidate()) {
                viewModel.registerUser(
                    User(
                        binding.usernameEditText.toString(),
                        binding.emailEditText.toString(),
                        binding.passwordEditText.toString()
                    )
                )
            }
        }

        viewModel.registerLiveData.observe(viewLifecycleOwner){
            when (it) {
                is AppState.AppStateSuccess<*> -> {
                    UserData.isAuthorized = true
                    activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
                }
                is AppState.AppStateError -> {

                }
                AppState.AppStateLoading -> {}
            }
        }
    }

    private fun isValidate(): Boolean =
        validateEmail() && validateUserName() && validatePassword() && validateConfirmPassword()

    private fun setupListeners() {
        binding.apply {
            emailEditText.addTextChangedListener(TextFieldValidation(binding.emailTextInputLayout))
            usernameEditText.addTextChangedListener(TextFieldValidation(binding.usernameTextInputLayout))
            passwordEditText.addTextChangedListener(TextFieldValidation(binding.passwordTextInputLayout))
            confirmPasswordEditText.addTextChangedListener(TextFieldValidation(binding.confirmPasswordTextInputLayout))
        }
    }

    private fun validateUserName(): Boolean {
        binding.apply {
            if (usernameEditText.text.toString().trim().isEmpty()) {
                usernameTextInputLayout.error = "Required Field!"
                usernameEditText.requestFocus()
                return false
            } else {
                usernameTextInputLayout.isErrorEnabled = false
            }
            return true
        }
    }

    private fun validateEmail(): Boolean {
        binding.apply {
            if (emailEditText.text.toString().trim().isEmpty()) {
                emailTextInputLayout.error = "Required Field!"
                emailTextInputLayout.editText?.requestFocus()
                return false
            } else if (!isValidEmail(emailEditText.text.toString())) {
                emailTextInputLayout.error = "Invalid Email!"
                emailEditText.requestFocus()
                return false
            } else {
                emailTextInputLayout.isErrorEnabled = false
            }
            return true
        }
    }

    private fun validatePassword(): Boolean {
        binding.apply {
            if (passwordEditText.text.toString().trim().isEmpty()) {
                passwordTextInputLayout.error = "Required Field!"
                passwordEditText.requestFocus()
                return false
            } else if (passwordEditText.text.toString().length < 6) {
                passwordTextInputLayout.error = "password can't be less than 6"
                passwordEditText.requestFocus()
                return false
            } else if (!isStringContainNumber(passwordEditText.text.toString())) {
                passwordTextInputLayout.error = "Required at least 1 digit"
                passwordEditText.requestFocus()
                return false
            } else {
                passwordTextInputLayout.isErrorEnabled = false
            }
            return true
        }
    }

    private fun validateConfirmPassword(): Boolean {
        when {
            binding.confirmPasswordTextInputLayout.editText?.text.toString().trim().isEmpty() -> {
                binding.confirmPasswordTextInputLayout.error = "Required Field!"
                binding.confirmPasswordTextInputLayout.editText?.requestFocus()
                return false
            }
            binding.confirmPasswordTextInputLayout.editText?.text.toString() != binding.passwordTextInputLayout.editText?.text.toString() -> {
                binding.confirmPasswordTextInputLayout.error = "Passwords don't match"
                binding.confirmPasswordTextInputLayout.editText?.requestFocus()
                return false
            }
            else -> {
                binding.confirmPasswordTextInputLayout.isErrorEnabled = false
            }
        }
        return true
    }

    inner class TextFieldValidation(private val view: View) : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(s: Editable?) {

            when (view.id) {
                R.id.username_edit_text -> {
                    validateUserName()
                }
                R.id.email_edit_text -> {
                    validateEmail()
                }
                R.id.password_edit_text -> {
                    validatePassword()
                }
                R.id.confirm_password_edit_text -> {
                    validateConfirmPassword()
                }
            }
        }

    }
}