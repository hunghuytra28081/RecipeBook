package com.example.recipebook.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipebook.R
import com.example.recipebook.databinding.ActivityMainBinding
import com.example.recipebook.extensions.addFragment
import com.example.recipebook.ui.container.ContainerFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragment(R.id.containerView, ContainerFragment.newInstance())
    }
}
