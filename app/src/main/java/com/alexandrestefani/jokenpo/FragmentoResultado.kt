package com.alexandrestefani.jokenpo

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.alexandrestefani.jokenpo.databinding.FragmentFragmentoResultadoBinding


class FragmentoResultado : Fragment() {
    lateinit var root : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFragmentoResultadoBinding.inflate(inflater,container,false)
        root = binding.root
        return root
    }




}