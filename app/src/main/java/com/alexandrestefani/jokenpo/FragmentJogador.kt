package com.alexandrestefani.jokenpo

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.alexandrestefani.jokenpo.databinding.FragmentjogadorBinding


class FragmentJogador : Fragment() {
    lateinit var root: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentjogadorBinding.inflate(inflater,container,false)
        root = binding.root

        return root
    }





}