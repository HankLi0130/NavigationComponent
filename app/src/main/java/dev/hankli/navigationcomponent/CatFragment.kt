package dev.hankli.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_cat.*

class CatFragment : Fragment(R.layout.fragment_cat) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_cat_submit.setOnClickListener { v ->
            val name = view_input_cat_name.text.toString()
            val age = view_input_cat_age.text.toString().toInt()
            val bundle = bundleOf("name" to name, "age" to age)
            v.findNavController().navigate(R.id.action_catFragment_to_catDetailFragment, bundle)
        }
    }
}