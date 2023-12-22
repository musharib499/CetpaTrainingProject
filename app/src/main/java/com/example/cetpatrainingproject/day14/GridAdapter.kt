package com.example.cetpatrainingproject.day14

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.cetpatrainingproject.R
import com.example.cetpatrainingproject.databinding.GridItemLayoutBinding
import org.w3c.dom.Text

class GridAdapter(context: Context, list: ArrayList<String>): ArrayAdapter<String>(context,0,list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView =  convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.grid_item_layout,parent,false)
        }
        val item = getItem(position)
        listItemView?.findViewById<TextView>(R.id.text_title)?.setText(item)

        return listItemView ?: super.getView(position, convertView, parent)
    }
}