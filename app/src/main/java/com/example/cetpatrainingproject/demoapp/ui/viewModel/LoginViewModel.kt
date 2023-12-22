package com.example.cetpatrainingproject.demoapp.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val eventLoginClick = MutableLiveData<Boolean>()

    fun onLogin() {
         eventLoginClick.value = true
    }

}