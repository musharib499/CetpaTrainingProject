package com.example.cetpatrainingproject.demoapp.ui

import android.app.Activity
import android.content.Intent
import android.os.BaseBundle
import android.os.Bundle
import android.widget.Toast


fun Activity.toast(message:String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

//fun Activity.toast(bundle: Bundle? = null ,message:String, ) {
//    val intent = Intent
//    startActivity()
//}