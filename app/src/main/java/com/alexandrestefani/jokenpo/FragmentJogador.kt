package com.alexandrestefani.jokenpo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.alexandrestefani.jokenpo.databinding.FragmentjogadorBinding


class FragmentJogador : Fragment() {
    private lateinit var root: View
    private lateinit var selecionarJogada:  Spinner
    private lateinit var onItemSelectedListener: OnItemSelectedListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        onItemSelectedListener = context as OnItemSelectedListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
        Log.d("LifeCicle","onCreate_fragmentJogador")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentjogadorBinding.inflate(inflater,container,false)
        root = binding.root
        selecionarJogada = binding.spinner
        setupSelecionarJogadasSpinner()



        Log.d("LifeCicle","onCreateView_fragmentJogador")
        return root
    }

    // metodos para seleção do spinner
    private fun setupSelecionarJogadasSpinner(){
        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.possibilidades_de_jogadas,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        selecionarJogada.adapter = adapter
        selecionarJogada.onItemSelectedListener = onItemSelectedListener
    }


    // Life Cycle controle
    override fun onStart() {
        super.onStart()
        Log.d("LifeCicle","onStart_fragmentJogador")
    }


    override fun onResume() {
        super.onResume()
        Log.d("LifeCicle","onResume_fragmentJogador")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCicle","onPause_fragmentJogador")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCicle","onStop_fragmentJogador")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCicle","onDestroy_fragmentJogador")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCicle","onDestroyView_fragmentJogador")
    }




}