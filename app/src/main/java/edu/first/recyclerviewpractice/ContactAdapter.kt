package edu.first.recyclerviewpractice

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val context: Context,val contact: List<Person>): RecyclerView.Adapter<ContactAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.item_person,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact= contact[position]
        holder.bind(contact)
    }

    override fun getItemCount()=contact.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val personName = itemView.findViewById<TextView>(R.id.personName)
        val personAge = itemView.findViewById<TextView>(R.id.personAge)
        @SuppressLint("SetTextI18n")
        fun bind(contact: Person)
        {
            personName.text=contact.name
            personAge.text="Age : ${contact.age}"
        }
    }

}


