package fr.nathan.projectbaseandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.Color.parseColor
import android.widget.NumberPicker



class InscriptionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_inscription, container, false)

        val np = root.findViewById(R.id.npAge) as NumberPicker

        np.minValue = 0
        np.maxValue = 10
        np.wrapSelectorWheel = false


        // Inflate the layout for this fragment
        return root
    }


}
