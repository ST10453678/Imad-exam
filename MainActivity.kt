package com.example.weeklyweatherconditions

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Declare the click
        val btnNextPage: Button = findViewById<Button>(R.id.btnNextPage)
        btnNextPage.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


            findViewById<Button>(R.id.btnExit).setOnClickListener {
                finish()
            }
        }
    }
}

