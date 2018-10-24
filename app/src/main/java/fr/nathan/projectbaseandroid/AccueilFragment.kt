package fr.nathan.projectbaseandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_adapter_view.*

class AccueilFragment : Fragment() {

    var items = Array<MyObject>(3, { MyObject() })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_accueil, container, false)
        seedItems()
        val rV = rootView.findViewById(R.id.recyclerView) as RecyclerView

        rV.layoutManager = LinearLayoutManager(activity)
        rV.adapter = AndVersionAdapteur(items)
        // Inflate the layout for this fragment
        return rootView
    }

    fun seedItems() {
        val nameArray = resources.getStringArray(R.array.name)
        for (k in 0..2) {
            items[k] = MyObject(nameArray[k])
        }

    }

}
