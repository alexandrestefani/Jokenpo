package com.alexandrestefani.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.alexandrestefani.jokenpo.databinding.ActivityhosterBinding

class HosterActivity : AppCompatActivity() {
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val binding = ActivityhosterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController

        // configuração da toolbar - video em https://www.youtube.com/watch?v=TP4U3ejoC98 (51:10) somente aparece na home
        //val appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawerLayout)

        //aparece a drawer nos fragmentos listados dentro do item setOf.
        appBarConfiguration = AppBarConfiguration(setOf(R.id.segundoFragmento,R.id.fragmentoResultado,R.id.fragmentoRegras), binding.drawerLayout)
        binding.toolbarnew.setupWithNavController(navController,appBarConfiguration)

        // configuração da DrawerNavigate - video em https://www.youtube.com/watch?v=TP4U3ejoC98 (1:10:18)
        binding.navidrawernew.setupWithNavController(navController)

        // configuração bottonNavigation - video em https://www.youtube.com/watch?v=TP4U3ejoC98 (1:21:00)
        binding.bottonnavnew.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id) {
                R.id.fragmentHome -> {
                    binding.bottonnavnew.visibility = View.GONE
                    binding.toolbarnew.visibility = View.GONE }
                else -> {
                    binding.bottonnavnew.visibility = View.VISIBLE
                    binding.toolbarnew.visibility = View.VISIBLE}
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)  || super.onSupportNavigateUp()
    }
}