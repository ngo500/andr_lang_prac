package com.example.android_language_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_language_practice.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.toolbar.title = getString(R.string.app_name)
        binding.locationButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_locationFragment)
        }
        binding.daysButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_daysFragment)
        }
        binding.numbersButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_numbersFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}