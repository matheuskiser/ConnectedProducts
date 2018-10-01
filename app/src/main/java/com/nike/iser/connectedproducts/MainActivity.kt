package com.nike.iser.connectedproducts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(this, findNavController(R.id.connected_products_nav_host_fragment))
    }

    override fun onSupportNavigateUp()
            = findNavController(R.id.connected_products_nav_host_fragment).navigateUp()
}
