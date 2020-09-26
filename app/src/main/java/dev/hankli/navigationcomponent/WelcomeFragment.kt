package dev.hankli.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private lateinit var mainActivity: MainActivity

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainActivity = requireActivity() as MainActivity

        view_btn_ok.setOnClickListener {
            mainActivity.hasCompletedWelcome = true
            // navigateToMain()
            mainActivity.restart()
        }
    }

    private fun navigateToMain() {
        findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToMainFragment())
    }
}