package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.homepage)

        val bottomNavigation = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Log.d("home page", "Home icon tapped, navigating to Home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish() // Optional: Close CasualPage if you don't want to keep it in the back stack
                    true
                }
                // Handle other navigation items if needed
                R.id.nav_search -> {
                    Log.d("home page", "search icon tapped, navigating to Home page")
                    val intent = Intent(this, Homepage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_cart -> {
                    Log.d("home page", "cart icon tapped, navigating to Home page")
                    val intent = Intent(this, MyCartPage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    Log.d("home page", "profile icon tapped, navigating to profile page")
                    val intent = Intent(this, ProfilePage::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }

        val rootLayout = findViewById<androidx.cardview.widget.CardView>(R.id.casual_card)
        rootLayout.setOnClickListener {
            Log.d("Homepage", "casual card tapped, navigating to casual page")
            val intent = Intent(this, CasualPage::class.java)
            startActivity(intent)
            finish()
        }

            val rootLayout2 = findViewById<androidx.cardview.widget.CardView>(R.id.Anniversary_card)
            rootLayout2.setOnClickListener {
                Log.d("Homepage", "Anniversary card tapped, navigating to Anniversary page")
                val intent = Intent(this, AnniversaryPage::class.java)
                startActivity(intent)
                finish()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
        }
        val rootLayout3 = findViewById<androidx.cardview.widget.CardView>(R.id.birth_card)
        rootLayout3.setOnClickListener {
            Log.d("Homepage", "birthday card tapped, navigating to birthday page")
            val intent = Intent(this, BirthdayPage::class.java)
            startActivity(intent)
            finish()
        }
        val rootLayout4 = findViewById<androidx.cardview.widget.CardView>(R.id.grad_card)
        rootLayout4.setOnClickListener {
            Log.d("Homepage", "birthday card tapped, navigating to birthday page")
            val intent = Intent(this, BirthdayPage::class.java)
            startActivity(intent)
            finish()
        }
        val btnNavigate=findViewById<TextView>(R.id.next_button2)
        btnNavigate.setOnClickListener {
            Log.d("Homepage", "Next button clicked, navigating to step 1 page")
            val intent = Intent(this, Step1Page::class.java)
            startActivity(intent)
        }

    }
}
//}