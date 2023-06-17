package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class PersonAdapter(context: Context, private val resource: Int, private val items: List<Person>) :
    ArrayAdapter<Person>(context, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(resource, parent, false)

        val person: Person = items[position]

        val avatarImageView: ImageView = view.findViewById(R.id.avatarImageView)
        val idTextView: TextView = view.findViewById(R.id.idTextView)
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val statusTextView: TextView = view.findViewById(R.id.statusTextView)
        val speciesTextView: TextView = view.findViewById(R.id.speciesTextView)
        val typeTextView: TextView = view.findViewById(R.id.typeTextView)
        val genderTextView: TextView = view.findViewById(R.id.genderTextView)
        val originTextView: TextView = view.findViewById(R.id.originTextView)
        val locationTextView: TextView = view.findViewById(R.id.locationTextView)

        Picasso.get().load(person.imageUrl).into(avatarImageView)

        idTextView.text = person.id.toString()
        nameTextView.text = person.name
        statusTextView.text = person.status
        speciesTextView.text = person.species
        typeTextView.text = person.type
        genderTextView.text = person.gender
        originTextView.text = person.origin
        locationTextView.text = person.location

        return view
    }
}
