
package com.example.weeklyweatherconditions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private val screenTime = IntArray(5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mondayInput = findViewById<EditText>(R.id.mondayInput)
        val tuesdayInput = findViewById<EditText>(R.id.tuesdayInput)
        val wednesdayInput = findViewById<EditText>(R.id.wednesdayInput)
        val thursdayInput = findViewById<EditText>(R.id.thursdayInput)
        val fridayInput = findViewById<EditText>(R.id.fridayInput)

        findViewById<Button>(R.id.submitButton).setOnClickListener {
            screenTime[0] = mondayInput.text.toString().toInt()
            screenTime[1] = tuesdayInput.text.toString().toInt()
            screenTime[2] = wednesdayInput.text.toString().toInt()
            screenTime[3] = thursdayInput.text.toString().toInt()
            screenTime[4] = fridayInput.text.toString().toInt()
        }

        findViewById<Button>(R.id.clearButton).setOnClickListener {
            screenTime.fill(0)
            mondayInput.text.clear()
            tuesdayInput.text.clear()
            wednesdayInput.text.clear()
            thursdayInput.text.clear()
            fridayInput.text.clear()
            Toast.makeText(this, "Data cleared. You can re-enter data", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.detailedViewButton).setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java).apply {
                putExtra("screenTime", screenTime)
            }
            startActivity(intent)
        }
    }
}





