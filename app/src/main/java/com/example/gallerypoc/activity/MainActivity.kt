package com.example.gallerypoc.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.gallerypoc.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        main_goto_gallery.setOnClickListener {
            val intent = Intent(this@MainActivity, MultiCustomGalleryUI::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java))
        }

    }
}