package com.example.sosbutton

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sosButton: Button = findViewById(R.id.sosButton)

        sosButton.setOnLongClickListener {
            val phoneNumber = "tel:6304896782"
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse(phoneNumber)
            startActivity(callIntent)
            true
        }
    }
}
