package com.example.recipebook.ui.container

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.recipebook.R
import com.example.recipebook.databinding.FragmentContainerBinding
import kotlinx.android.synthetic.main.fragment_container.*

class ContainerFragment : Fragment() {

    private lateinit var binding: FragmentContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContainerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentContainer = childFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = fragmentContainer.findNavController()
        binding.bottomNavContainer.setupWithNavController(navController)
    }

    companion object {
        fun newInstance() = ContainerFragment()
    }
}
