package com.example.dashboard_26_prajna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splashcreen_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashcreen2)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@Splashcreen_2, Splashcreen_1::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }
}