package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.profilepage)

        val bottomNavigation = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Log.d("profile page", "Home icon tapped, navigating to home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish() // Optional: Close CasualPage if you don't want to keep it in the back stack
                    true
                }
                R.id.nav_search -> {
                    Log.d("profile page", "search icon tapped, navigating to search page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_cart -> {
                    Log.d("profile page", "cart icon tapped, navigating to cart page")
                    val intent = Intent(this, MyCartPage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    Log.d("profile page", "profile icon tapped, navigating to profile page")
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