package edu.first.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Person(val name:String,val age:Int)

class MainActivity : AppCompatActivity()
{
    private lateinit var rvContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContact = findViewById(R.id.rvContact)
        val contact=contactCreate()
        rvContact.adapter=ContactAdapter(this,contact)
        rvContact.layoutManager=LinearLayoutManager(this)
    }
    private fun contactCreate() : List<Person>{
        val contact= mutableListOf<Person>()
        for (i in 1..100)
        {
            contact.add(Person("Person $i",i))
        }
        return contact
    }
}