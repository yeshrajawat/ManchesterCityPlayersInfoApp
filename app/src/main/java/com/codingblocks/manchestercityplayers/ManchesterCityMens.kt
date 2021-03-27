package com.codingblocks.manchestercityplayers

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_manchester_city_mens.*


class ManchesterCityMens : Fragment() {

    val player = arrayOf("Sergio King Kun Aguero","Fernandinho","Kevin De Bruyne","Ilkay Gundogan","Raheem Sterling","Riyad Mahrez","Ederson Moraes","Kyle Walker","Gabriel Jesus","John Stones","Aymeric Laporte","Jao Cancelo","Rodri","Bernardo Silva","Phil Foden","Oleksandar Zinchenko","Benjamin Mendy","Ruben Diaz","Nathn Ake","Zack Steffan","Scott Carson")
    val players = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        for(i in player)
        {
            players.add(i)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_manchester_city_mens, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PlayerRv(players)
        playerrv.layoutManager = LinearLayoutManager(context)
        playerrv.adapter = adapter


    }



}