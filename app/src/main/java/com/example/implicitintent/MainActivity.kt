package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Media
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webbutton= findViewById<CardView>(R.id.cardweb)
        val camerabutton= findViewById<CardView>(R.id.cardcamera)

        webbutton.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://developer.android.com/courses")
            startActivity(intent)
        }

        camerabutton.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}