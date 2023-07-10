package com.fshangala.dlambo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ConnectionsViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val connectionsLayout : LinearLayout
    val devicetype : TextView
    val datetime : TextView
    init {
        connectionsLayout = view.findViewById(R.id.connectionsLayout)
        connectionsLayout.isClickable = true
        devicetype = view.findViewById(R.id.textView1)
        datetime = view.findViewById(R.id.textView2)
    }
}

class ConnectionsAdapter(private val dataSet : Array<Map<String,String>>) : RecyclerView.Adapter<ConnectionsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConnectionsViewHolder {
        return ConnectionsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.connection_row_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ConnectionsViewHolder, position: Int) {
        holder.devicetype.text = dataSet[position]["devicetype"]
        holder.datetime.text = dataSet[position]["datetime"]
    }
}