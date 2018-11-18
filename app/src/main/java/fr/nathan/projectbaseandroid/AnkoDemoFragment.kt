package fr.nathan.projectbaseandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar

class AnkoDemoFragment : Fragment(), AnkoLogger {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_anko_demo, container, false)

        val buttonerror = root.findViewById(R.id.buttonError) as Button
        buttonerror.setOnClickListener { view ->
            snackbar(view, "Erreur: Vous ne pouvez pas faire ça.").show()
        }

        val buttomMessage = root.findViewById(R.id.buttonMessage) as Button
        buttomMessage.setOnClickListener { view ->
            view.getContext().toast("Ce message est rapide.")
        }
        val buttondialogue = root.findViewById(R.id.buttonDialogue) as Button
        buttondialogue.setOnClickListener { view ->
            activity!!.alert("Ceci est un dialogue.") {
                title = "Voulez-vous faire disparaître ce message ?"
                positiveButton("Ok") { }
                negativeButton("Non") { }
            }.show()
        }

        val buttonecran = root.findViewById(R.id.buttonEcran) as Button
        buttonecran.setOnClickListener { view ->
            activity!!.sendSMS("0123456789", "Ceci est un message de test à ne pas envoyer.")
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
