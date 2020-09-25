package dev.hankli.navigationcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var appBarConfig: AppBarConfiguration

    var hasCompletedWelcome: Boolean
        get() = getPreferences(MODE_PRIVATE).getBoolean("hasCompletedWelcome", false)
        set(value) = getPreferences(MODE_PRIVATE).edit()
            .putBoolean("hasCompletedWelcome", value)
            .apply()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navController = findNavController()
        appBarConfig = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfig)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id == R.id.welcomeFragment) {
                supportActionBar?.hide()
            } else {
                supportActionBar?.show()
            }
        }

        if (!hasCompletedWelcome) {
            navController.navigate(MainFragmentDirections.actionMainFragmentToWelcomeFragment())
        }
    }

    private fun findNavController(): NavController {
        return findNavController(R.id.nav_host_fragment)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController().navigateUp(appBarConfig) || super.onSupportNavigateUp()
    }
}