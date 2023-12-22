package com.example.cetpatrainingproject.demoapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.cetpatrainingproject.R
import com.example.cetpatrainingproject.databinding.ActivityLoginBinding
import com.example.cetpatrainingproject.day7.UserData
import com.example.cetpatrainingproject.demoapp.ui.model.LoginData
import com.example.cetpatrainingproject.demoapp.ui.viewModel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    private var binding:ActivityLoginBinding? = null
    private val TAG = "LoginActivity"
    private val loginArray = mutableListOf<LoginData>()
    private val loginViewMode by viewModels<LoginViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityLoginBinding?>(this,R.layout.activity_login).apply {
            lifecycleOwner = this@LoginActivity
            this.viewModel = loginViewMode
        }

    }


    private fun getUpdatedData() {
        loginViewMode.apply {
            eventLoginClick.observe(this@LoginActivity, Observer {
                getLogin()
            })
        }
    }



    private fun getLogin() {
        val userName = binding?.edtUsername?.text.toString()
        val password = binding?.etdPassword?.text.toString()

        if (userName.isNullOrEmpty()) {
            this.toast("Please enter user name")
            return
        }

        if (password.isNullOrEmpty()) {
            this.toast("Please enter password")
            return
        }
        isCheck(userName, password)

        this.toast("Successful Login")

    }

    fun saveUserIdAndePassword(userId:String,password:String) {
        val editer = sharedPreferences()?.edit()
         editer?.apply {
             putString(USER_ID, userId)
             putString(PASSWORD, password)
             apply()
         }

    }

    private fun isCheck(userId:String,userPassword:String) {
        val  isCheck = binding?.cbRemember?.isChecked?:false
        if (isCheck) {
            saveUserIdAndePassword(userId,userPassword)
            //loginArray.add(LoginData(userId,userPassword))

        }
//        loginArray.forEach {
//            Log.d(TAG,it.toString())
//        }
    }
}



