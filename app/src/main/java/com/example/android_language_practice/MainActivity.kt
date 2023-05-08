package com.example.android_language_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android_language_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.root
        setContentView(view)
    }
}