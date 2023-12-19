package com.example.cetpatrainingproject.demoapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.cetpatrainingproject.R
import com.example.cetpatrainingproject.databinding.ActivityLoginBinding
import com.example.cetpatrainingproject.day7.UserData
import com.example.cetpatrainingproject.demoapp.ui.model.LoginData

class LoginActivity : AppCompatActivity() {
    private var binding:ActivityLoginBinding? = null
    private val TAG = "LoginActivity"
    private val loginArray = mutableListOf<LoginData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        binding?.btnLogin?.setOnClickListener {
            getLogin()
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

    private fun isCheck(userId:String,userPassword:String) {
        val  isCheck = binding?.cbRemember?.isChecked?:false
        if (isCheck) {
            loginArray.add(LoginData(userId,userPassword))
        }
        loginArray.forEach {
            Log.d(TAG,it.toString())
        }
    }
}



