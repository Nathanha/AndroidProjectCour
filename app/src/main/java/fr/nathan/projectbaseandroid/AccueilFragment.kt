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
        animals.add("1")
        animals.add("2")
        animals.add("3")
        animals.add("4")
        animals.add("5")
        animals.add("6")
        animals.add("7")
        animals.add("8")
        animals.add("9")
        genre.add("1")
        genre.add("2")
        genre.add("3")
        genre.add("4")
        genre.add("5")
        genre.add("6")
        genre.add("7")
        genre.add("8")
        genre.add("9")
        img.add(R.drawable.wish1)
        img.add(R.drawable.wish2)
        img.add(R.drawable.wish3)
        img.add(R.drawable.wish4)
        img.add(R.drawable.wish5)
        img.add(R.drawable.wish6)
        img.add(R.drawable.wish7)
        img.add(R.drawable.wish8)
        img.add(R.drawable.wish9)

    }
}

