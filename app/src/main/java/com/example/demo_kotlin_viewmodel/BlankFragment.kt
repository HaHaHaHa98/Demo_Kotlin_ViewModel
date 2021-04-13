package com.example.demo_kotlin_viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_blank.view.*


class BlankFragment : Fragment() {

    lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        viewModel = activity?.let {
            ViewModelProvider(it)[SharedViewModel::class.java]
        } ?: throw Exception("Activity is null")

        view.btn_sender.setOnClickListener {
            viewModel?.setSelected("GOTTA")
        }
        return view
    }


}