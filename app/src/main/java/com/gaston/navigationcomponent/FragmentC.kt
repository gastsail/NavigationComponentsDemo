package com.gaston.navigationcomponent


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentC : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nombre = FragmentCArgs.fromBundle(arguments!!).nombre
        val edad = FragmentCArgs.fromBundle(arguments!!).edad
        Log.d("Valor recibido: ", "nombre: $nombre edad: $edad")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }


}
