package fr.nathan.projectbaseandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AccueilFragment : Fragment() {

    var genre: ArrayList<String> = ArrayList()
    val animals: ArrayList<String> = ArrayList()
    val img: ArrayList<Int> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addAnimals()

        var rootView = inflater.inflate(R.layout.fragment_accueil, container, false)

        var listAnimal = rootView.findViewById(R.id.rv_animal_list) as RecyclerView

        listAnimal.layoutManager = LinearLayoutManager(activity)
        listAnimal.adapter = AnimalAdapter(animals, genre, img)

        // Inflate the layout for this fragment
        return rootView
    }


    // Adds animals to the empty animals ArrayList
    fun addAnimals() {
        animals.add("Pull Gris")
        animals.add("Parapluie")
        animals.add("Montre Or")
        animals.add("Chaussures Fille")
        animals.add("Chapeau Cowboy")
        animals.add("Livret Vinyl")
        animals.add("Bracelet Fleur")
        animals.add("Mètre")
        genre.add("100€")
        genre.add("200€")
        genre.add("150€")
        genre.add("800€")
        genre.add("1000€")
        genre.add("500€")
        genre.add("300€")
        genre.add("80€")
        img.add(R.drawable.wish1)
        img.add(R.drawable.wish3)
        img.add(R.drawable.wish4)
        img.add(R.drawable.wish5)
        img.add(R.drawable.wish6)
        img.add(R.drawable.wish7)
        img.add(R.drawable.wish8)
        img.add(R.drawable.wish9)

    }
}

