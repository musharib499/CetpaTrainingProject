package com.example.cetpatrainingproject.demoapp.ui

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.BaseBundle
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


fun Activity.toast(message:String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

//fun Activity.toast(bundle: Bundle? = null ,message:String, ) {
//    val intent = Intent
//    startActivity()
//}

fun Activity.sharedPreferences() :SharedPreferences = this.getSharedPreferences("cetpaSharedPreference", AppCompatActivity.MODE_PRIVATE)
