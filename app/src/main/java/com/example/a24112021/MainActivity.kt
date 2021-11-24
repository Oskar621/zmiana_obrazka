package com.example.a24112021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_image1).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.amongusamumu)
        }
        findViewById<Button>(R.id.button_image2).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.oooo)
        }
        findViewById<Button>(R.id.button_image3).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.vislaud);
        }
        findViewById<Button>(R.id.button_image4).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pogchamp)
        }
    }


}