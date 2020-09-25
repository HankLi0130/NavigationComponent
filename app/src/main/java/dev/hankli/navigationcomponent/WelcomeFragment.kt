package dev.hankli.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_btn_ok.setOnClickListener {
            (requireActivity() as MainActivity).hasCompletedWelcome = true
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToMainFragment())
        }
    }
}