package fr.nathan.projectbaseandroid

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_my_object.view.*

class AndVersionAdapteur(val items: Array<MyObject>) : RecyclerView.Adapter<AndVersionAdapteur.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        fun bindMyObject(myObject: MyObject){
            with(myObject){
                itemView.objectName.text = "$name"

            }
        }
    }

    override fun getItemCount(): Int = items.size

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View{
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndVersionAdapteur.ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_my_object))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindMyObject(items[position])
    }

}