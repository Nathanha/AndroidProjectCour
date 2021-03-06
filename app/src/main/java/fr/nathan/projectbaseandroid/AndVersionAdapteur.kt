package fr.nathan.projectbaseandroid

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_my_object.view.*

class AnimalAdapter(val items : ArrayList<String>, val genre : ArrayList<String>, val imgs : ArrayList<Int>) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_my_object, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAnimalType?.text = items.get(position)
        holder.tvAnimalGenre?.text = genre.get(position)
        holder.imageLigne?.setImageResource(imgs.get(position))
    }
}

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = view.tv_animal_type
    val tvAnimalGenre = view.tv_animal_genre
    val imageLigne = view.imgLine

    }