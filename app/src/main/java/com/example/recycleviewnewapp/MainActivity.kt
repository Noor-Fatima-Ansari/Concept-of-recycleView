package com.example.recycleviewnewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(),click {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)

        var adapter= Adapter(data(),this)
        recyclerView.adapter=adapter
        print(adapter.toString())
}


 private fun data(): ArrayList<String> {
    val list= ArrayList<String>()
    for (i in 0 until 100) {
        list.add("Item is $i")
    }
     return list
}

    override fun clickItem(item: String) {
        Toast.makeText(this, "Click item is $item", Toast.LENGTH_SHORT).show()
    }


}