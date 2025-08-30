package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboard2)
        val btnNavigate=findViewById<Button>(R.id.Get_button)
        btnNavigate.setOnClickListener {
            Log.d("Onboard2", "Next button clicked, navigating to Onboard3")
            val intent = Intent(this, Onboard3::class.java)
            startActivity(intent)
        }
        val btnNavigate2=findViewById<TextView>(R.id.skip_text)
        btnNavigate2.setOnClickListener {
            Log.d("Onboard2", "Next button clicked, navigating to Onboard4")
            val intent = Intent(this, Onboard4::class.java)
            startActivity(intent)
        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
        }
    }
//}