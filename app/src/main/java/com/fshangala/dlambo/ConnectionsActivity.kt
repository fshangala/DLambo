package com.fshangala.dlambo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ConnectionsActivity : AppCompatActivity() {
    private var model: DViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connections)

        model = ViewModelProvider(this)[DViewModel::class.java]

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        model!!.connections.observe(this) {
            recyclerView.adapter = ConnectionsAdapter(it)
        }
    }
}