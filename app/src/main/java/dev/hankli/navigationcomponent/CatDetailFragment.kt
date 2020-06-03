package dev.hankli.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_cat_detail.*

class CatDetailFragment : Fragment(R.layout.fragment_cat_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val age = arguments?.getInt("age")
        val text = "$name is $age years old!"
        view_cat_detail.text = text
    }
}