package fr.nathan.projectbaseandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_accueil.*

class AccueilFragment : Fragment() {

    var items: ArrayList<String> = ArrayList()
    val animals: ArrayList<String> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addAnimals()

        items.add("Salut")
        items.add("LOL")
        items.add("Mdr")

        var rootView = inflater.inflate(R.layout.fragment_accueil, container, false)

        var listAnimal = rootView.findViewById(R.id.rv_animal_list) as RecyclerView

        listAnimal.layoutManager = LinearLayoutManager(activity)
        listAnimal.adapter = AnimalAdapter(animals)

        // Inflate the layout for this fragment
        return rootView
    }



    // Adds animals to the empty animals ArrayList
    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }
}

