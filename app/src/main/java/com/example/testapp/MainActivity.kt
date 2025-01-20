package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.fragments.FragmentRecyclerView
import com.example.testapp.fragments.FragmentTabLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.nav_RecyclerView

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_RecyclerView -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmentRecyclerView())
                        .commit()
                }

                R.id.nav_TabLayout -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmentTabLayout())
                        .commit()
                }
            }
            true
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentRecyclerView())
            .commit()


        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
    }
}