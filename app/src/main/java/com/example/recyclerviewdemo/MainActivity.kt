package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var myStudentList = ArrayList<StudentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateData()

        val btn: Button = findViewById(R.id.btnOK)

        btn.setOnClickListener() {
            val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

            recyclerView.adapter = MyAdapter(myStudentList)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
        }

    }

    fun generateData(){
        val stud1 = StudentItem(R.drawable.ic_face, name="John", programme = "RIT")
        val stud2 = StudentItem(R.drawable.ic_face, name="Mark42", programme = "RIT")
        myStudentList.add(stud1)
        myStudentList.add(stud2)
    }

}