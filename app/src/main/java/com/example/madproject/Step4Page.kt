package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Step4Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.step4page)

        val bottomNavigation = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Log.d("step2page", "Home icon tapped, navigating to home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish() // Optional: Close CasualPage if you don't want to keep it in the back stack
                    true
                }
                // Handle other navigation items if needed
                R.id.nav_search -> {
                    // Add navigation to Search page if implemented
                    true
                }
                R.id.nav_cart -> {
                    // Add navigation to Cart page if implemented
                    true
                }
                R.id.nav_profile -> {
                    // Add navigation to Profile page if implemented
                    true
                }
                else -> false
            }
        }
        val btnNavigate=findViewById<TextView>(R.id.pre_button1)
        btnNavigate.setOnClickListener {
            Log.d("step4page", "Previous button clicked, navigating to step 1 page")
            val intent = Intent(this, Step3Page::class.java)
            startActivity(intent)
        }
        val btnNavigate1=findViewById<TextView>(R.id.next2_button)
        btnNavigate1.setOnClickListener {
            Log.d("step4page", "next button clicked, navigating cart")
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