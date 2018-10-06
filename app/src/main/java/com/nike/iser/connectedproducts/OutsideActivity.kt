package com.nike.iser.connectedproducts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class OutsideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outside)

        NavigationUI.setupActionBarWithNavController(this, findNavController(R.id.outside_activity_nav_host_fragment))
    }

    override fun onSupportNavigateUp()
            = findNavController(R.id.outside_activity_nav_host_fragment).navigateUp()
}
