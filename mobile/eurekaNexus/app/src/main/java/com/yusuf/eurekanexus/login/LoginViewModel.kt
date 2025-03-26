package com.yusuf.eurekanexus.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
) : ViewModel() {

    private val _state = MutableStateFlow(LoginState())
    val state = _state.asStateFlow()

    fun onEmailChange(email: String) {
        _state.update { it.copy(email = email) }
    }

    fun onPasswordChange(password: String) {
        _state.update { it.copy(password = password) }
    }

    fun onLoginClick() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = null) }
            
            loginRepository.login(_state.value.email, _state.value.password)
                .onSuccess {
                    _state.update { it.copy(isLoggedIn = true, isLoading = false) }
                }
                .onFailure { exception ->
                    _state.update { 
                        it.copy(
                            error = exception.message ?: "Unknown error",
                            isLoading = false
                        )
                    }
                }
        }
    }
} 