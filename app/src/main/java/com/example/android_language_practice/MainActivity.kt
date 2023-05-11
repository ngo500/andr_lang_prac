package com.example.android_language_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.example.android_language_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.root
        setContentView(view)

        //Log.i("my_log", "in main activity now")

        if (savedInstanceState != null) return

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        //val navController = navHostFragment.navController
    }

    //options menu from toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    //function for handling item selected in options menu on toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_share -> handleShare()
            else -> return super.onOptionsItemSelected(item)
        }

        return super.onOptionsItemSelected(item)
    }

    //function for handling specific action_share selected in options menu on toolbar
    private fun handleShare(): Boolean {
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "Sharing livedata amount ${viewModel.info.value}")
        }
        startActivity(intent)
        return true
    }
}