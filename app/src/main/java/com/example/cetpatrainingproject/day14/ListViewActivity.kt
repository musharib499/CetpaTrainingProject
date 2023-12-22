package com.example.cetpatrainingproject.day14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.cetpatrainingproject.R
import com.example.cetpatrainingproject.databinding.ActivityListViewBinding
import com.example.cetpatrainingproject.databinding.DemoGridViewBinding

class ListViewActivity : AppCompatActivity() {
    var binding: ActivityListViewBinding?= null
    var listAdapter: GridAdapter? = null
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
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list_view)
        setListAdapter()
        setSpinnerAdapter()

    }
    private fun setListAdapter() {
        listAdapter = GridAdapter(this,list)
        binding?.list?.adapter = listAdapter

    }

    private fun setSpinnerAdapter() {
       // val adapterSpinner = ArrayAdapter(this,android.R.layout.simple_spinner_item, list)
        listAdapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding?.spinner?.adapter = listAdapter

    }
}