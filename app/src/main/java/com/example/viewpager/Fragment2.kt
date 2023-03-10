package com.example.viewpager

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    private lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = Fragment2Binding.inflate(inflater,container,false)
        binding.btn2.setOnClickListener {
            activity.let{
                val intent = Intent(it,MainActivity2::class.java)
                startActivity(intent)
            }
        }
        return binding.root

    }

}