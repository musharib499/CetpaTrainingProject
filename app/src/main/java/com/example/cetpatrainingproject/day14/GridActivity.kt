package com.example.cetpatrainingproject.day14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cetpatrainingproject.R
import com.example.cetpatrainingproject.databinding.DemoGridViewBinding

class GridActivity : AppCompatActivity() {
    var binding:DemoGridViewBinding?= null
    var gridAdapter: GridAdapter? = null
    val list = arrayListOf(
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
        "Sachin", "Sanya", "Rupesh","Asif",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.demo_grid_view)
        setGridAdapter()

    }
    private fun setGridAdapter() {
        gridAdapter = GridAdapter(this,list )
        binding?.grid?.adapter = gridAdapter
    }
}