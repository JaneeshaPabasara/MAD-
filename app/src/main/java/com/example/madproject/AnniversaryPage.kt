package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AnniversaryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.anniversarypage)

        val bottomNavigation = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Log.d("Anniversary page", "Home icon tapped, navigating to Home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish() // Optional: Close CasualPage if you don't want to keep it in the back stack
                    true
                }
                // Handle other navigation items if needed
                R.id.nav_search -> {
                    Log.d("Anniversary page", "search icon tapped, navigating to Home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_cart -> {
                    Log.d("Anniversary page", "cart icon tapped, navigating to Home page")
                    val intent = Intent(this, MyCartPage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    Log.d("Anniversary page", "profile icon tapped, navigating to profile page")
                    val intent = Intent(this, ProfilePage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets


//}