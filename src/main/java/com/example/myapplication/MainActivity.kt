package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            //Llamamos a la función para crear el listado
            crearListado()
        } catch (ex: Exception) {
            println("Error: " + ex.message)
        } finally {

        }
    }

    fun crearListado() {
        val listView: ListView = findViewById(R.id.listView)

        val personList = listOf(
            Person(196, "Krombopulos, Michael", "Dead", "Alien", "Gromflomite", "Male", "Unknown", "Unknown", "https://rickandmortyapi.com/api/character/avatar/196.jpeg"),
            Person(354, "Toby Matthews", "Alive", "Human", "Unknown", "Male", "Earth", "Earth", "https://rickandmortyapi.com/api/character/avatar/354.jpeg"),
            Person(383, "Yaarb", "Alive", "Alien", "Unknown", "Male", "Unknown", "St. Gloopy Noops Hospital", "https://rickandmortyapi.com/api/character/avatar/383.jpeg"),
            Person(463, "SEAL Team Rick", "Dead", "Human", "Unknown", "Male", "Unknown", "Citadel of Ricks", "https://rickandmortyapi.com/api/character/avatar/463.jpeg"),
            Person(571, "Slippy", "Alive", "Animal", "Snake", "Female", "Earth", "Snake Planet", "https://rickandmortyapi.com/api/character/avatar/571.jpeg"),
            Person(627, "The Concept of Time", "Alive", "Unknown", "Soulless Puppet", "Genderless", "Story Train", "Story Train", "https://rickandmortyapi.com/api/character/avatar/627.jpeg")
        )

        val adapter = PersonAdapter(this, R.layout.item_person, personList)

        listView.adapter = adapter
    }
}