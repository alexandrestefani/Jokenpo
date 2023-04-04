package com.alexandrestefani.jokenpo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.alexandrestefani.jokenpo.databinding.FragmentFragmentoResultadoBinding
import org.w3c.dom.Text


class FragmentoResultado : Fragment() {
    lateinit var root : View
    lateinit var engine: GameEngine
    lateinit var resultText: TextView
    lateinit var usuarioJogadaText: TextView
    lateinit var appJogadaText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
        Log.d("LifeCicle","onCreate_fragmentResultado")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFragmentoResultadoBinding.inflate(inflater,container,false)
        root = binding.root
        Log.d("LifeCicle","onCreateView_fragmentResultado")
        engine =  GameEngine(resources.getStringArray(R.array.possibilidades_de_jogadas))
        resultText = binding.textoGanhador
        val jogadaAtual = arguments?.getString("jogadaAtual")
        usuarioJogadaText =binding.usuariojogada
        usuarioJogadaText.text="Voce: "+jogadaAtual.toString()

        appJogadaText = binding.APPjogada


        jogadaAtual?.let{
            updateResultText(jogadaAtual)
        }

        return root
    }

    private fun updateResultText(jogadaAtual: String){
       val resultGame =  engine.calcularQuemGanhou(jogadaAtual)

        resultText.text = when(resultGame){
            Result.VITORIA -> "Voce ganhou!"
            Result.DERROTA -> "Voce perdeu :("
            else -> "Empatou ;)"

        }

        appJogadaText.text = when{
            resultGame == Result.EMPATE -> "App igual você"
            jogadaAtual=="papel"&& resultGame  == Result.VITORIA  -> "App: pedra"
            jogadaAtual=="papel"&& resultGame  == Result.DERROTA  -> "App: tesoura"
            jogadaAtual=="pedra"&& resultGame  == Result.VITORIA  -> "App: tesoura"
            jogadaAtual=="pedra"&& resultGame  == Result.DERROTA  -> "App: papel"
            jogadaAtual=="tesoura"&& resultGame  == Result.DERROTA  -> "App: pedra"
            else -> "App: papel"

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCicle","onStart_fragmentResultado")
    }


    override fun onResume() {
        super.onResume()
        Log.d("LifeCicle","onResume_fragmentResultado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCicle","onPause_fragmentResultado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCicle","onStop_fragmentResultado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCicle","onDestroy_fragmentResultado")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCicle","onDestroyView_fragmentResultado")
    }


}