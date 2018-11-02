package fr.nathan.projectbaseandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.jetbrains.anko.*

class AnkoDemoFragment : Fragment(), AnkoLogger {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_anko_demo, container, false)

        val buttonerror = root.findViewById(R.id.buttonError) as Button
        buttonerror.setOnClickListener { view ->
            info("Kotlin is an island")
        }

        val buttomMessage = root.findViewById(R.id.buttonMessage) as Button
        buttomMessage.setOnClickListener { view ->
            activity!!.toast("TOAST")
        }
        val buttondialogue = root.findViewById(R.id.buttonDialogue) as Button
        buttondialogue.setOnClickListener { view ->
            activity!!.alert("YO") {
                title = "Awesome quote"
                positiveButton("Love") { }
                negativeButton("Not at all") { }
            }.show()
        }

        val buttonweb = root.findViewById(R.id.buttonWeb) as Button
        buttonweb.setOnClickListener { view ->
            activity!!.browse("https://www.google.com/")
        }

        val buttonpartage = root.findViewById(R.id.buttonPartage) as Button
        buttonpartage.setOnClickListener { view ->
            activity!!.share("Partager", "mon contenus")
        }

        // Inflate the layout for this fragment
        return root
    }

}
