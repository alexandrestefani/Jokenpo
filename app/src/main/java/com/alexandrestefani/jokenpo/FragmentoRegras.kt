package com.alexandrestefani.jokenpo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentoRegras : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
        Log.d("LifeCicle","onCreate_fragmentRegras")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("LifeCicle","onCreateView_fragmentRegras")
        return inflater.inflate(R.layout.fragment_fragmento_regras, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCicle","onStart_fragmentRegras")
    }


    override fun onResume() {
        super.onResume()
        Log.d("LifeCicle","onResume_fragmentRegras")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCicle","onPause_fragmentRegras")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCicle","onStop_fragmentRegras")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCicle","onDestroy_fragmentRegras")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCicle","onDestroyView_fragmentRegras")
    }
}