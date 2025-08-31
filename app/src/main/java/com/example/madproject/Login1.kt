package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login2)

        val btnNavigate=findViewById<Button>(R.id.pre_button1)
        btnNavigate.setOnClickListener {
            Log.d("login page", "login button clicked, navigating to homepage")
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }
        val rootLayout = findViewById<TextView>(R.id.forget_password)
        rootLayout.setOnClickListener {
            Log.d("MainActivity", "Screen tapped, navigating to Onboard1")
            val intent = Intent(this, ForgetPass::class.java)
            startActivity(intent)
            finish()}

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
    }
}
//}