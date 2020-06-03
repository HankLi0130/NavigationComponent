package dev.hankli.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_dog_detail.*

class DogDetailFragment : Fragment(R.layout.fragment_dog_detail) {

    private val args: DogDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = "${args.name} is ${args.age} years old!"
        view_dog_detail.text = text

    }
}