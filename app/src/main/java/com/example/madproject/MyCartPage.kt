package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MyCartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.mycart)

        val bottomNavigation = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Log.d("my cart page", "Home icon tapped, navigating to home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish() // Optional: Close CasualPage if you don't want to keep it in the back stack
                    true
                }

                R.id.nav_search -> {
                    Log.d("my cart page", "search icon tapped, navigating to search page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_cart -> {
                    Log.d("my cart page", "cart icon tapped, navigating to cart page")
                    val intent = Intent(this, MyCartPage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    Log.d("my cart page", "profile icon tapped, navigating to profile page")
                    val intent = Intent(this, ProfilePage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
        val btnNavigate=findViewById<TextView>(R.id.next_button)
        btnNavigate.setOnClickListener {
            Log.d("step1page", "Next button clicked, navigating to step 2 page")
            val intent = Intent(this, Step2Page::class.java)
            startActivity(intent)
        }
    }
}

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets


//}