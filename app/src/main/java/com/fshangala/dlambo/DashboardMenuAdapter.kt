package com.fshangala.dlambo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DashboardMenuAdapter(private val context: Context, private val dataSet: Array<String>) : RecyclerView.Adapter<DashboardMenuAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val linearLayout : LinearLayout
        init {
            textView = view.findViewById(R.id.textView)
            linearLayout = view.findViewById(R.id.linearLayout)
            linearLayout.isClickable = true
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardMenuAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item,parent,false)
        return DashboardMenuAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardMenuAdapter.ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
        holder.linearLayout.setOnClickListener {
            when(dataSet[position]){
                "Connections" -> {
                    val intent = Intent(context,ConnectionsActivity::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}