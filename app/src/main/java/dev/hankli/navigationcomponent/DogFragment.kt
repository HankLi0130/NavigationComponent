package dev.hankli.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_dog.*

class DogFragment : Fragment(R.layout.fragment_dog) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_dog_submit.setOnClickListener { v ->
            val name = view_input_dog_name.text.toString()
            val age = view_input_dog_age.text.toString().toInt()
            val action = DogFragmentDirections.actionDogFragmentToDogDetailFragment(name, age)
            v.findNavController().navigate(action)
        }
    }
}