package com.alexandrestefani.jokenpo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FragmentHome : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
        Log.d("LifeCicle", "onCreate_fragmentHome")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<Button>(R.id.buttoniniciar).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_fragmentHome_to_segundoFragmento)

        }
        setHasOptionsMenu(false)
        Log.d("LifeCicle", "onCreateView_fragmentHome")

        return view
    }


    override fun onStart() {
        super.onStart()
        Log.d("LifeCicle", "onStart_fragmentHome")
    }


    override fun onResume() {
        super.onResume()
        Log.d("LifeCicle", "onResume_fragmentHome")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCicle", "onPause_fragmentHome")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCicle", "onStop_fragmentHome")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCicle", "onDestroy_fragmentHome")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCicle", "onDestroyView_fragmentHome")
    }
}