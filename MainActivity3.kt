package com.example.weeklyweatherconditions

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val screenTime = intent.getIntArrayExtra("screenTime") ?: intArrayOf()
        val categories = intent.getStringArrayExtra("categories") ?: arrayOf()

        val totalMaximumTemperature = screenTime.sum()
        val averageMinimumTemperature = if (screenTime.isNotEmpty()) totalMaximumTemperature / screenTime.size else 0

        findViewById<TextView>(R.id.totalmaximumTemperature).text = "Total Maximum Temperature: $totalMaximumTemperature minutes"
        findViewById<TextView>(R.id.totalminimumTemperature).text = "Average Minimum Temperature: $averageMinimumTemperature minutes"

        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish() // Go back to the previous screen
        }
    }
}
