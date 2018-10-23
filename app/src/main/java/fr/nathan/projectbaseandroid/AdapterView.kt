package fr.nathan.projectbaseandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_adapter_view.*

class AdapterView : AppCompatActivity() {

    var items = Array<MyObject>(3, { MyObject() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_view)

        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndVersionAdapteur(items)
    }

    fun seedItems() {
        val nameArray = resources.getStringArray(R.array.name)
        for (k in 0..2) {
            items[k] = MyObject(nameArray[k])
        }

    }

}
