package com.example.demo_kotlin_viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_blank2.view.*


class BlankFragment2 : Fragment() {
    lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        viewModel = activity?.let {
            ViewModelProvider(it)[SharedViewModel::class.java]
        } ?: throw Exception("Activity is null")

        viewModel?.selected.observe(this, Observer {
            view.tv_Message.text=it.toString()
        })
        return view
    }


}