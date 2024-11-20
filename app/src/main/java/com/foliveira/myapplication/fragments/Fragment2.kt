package com.foliveira.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.foliveira.myapplication.R

class Fragment2: Fragment() {
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.btn_fragment_2)
        button.setOnClickListener {
            val fragment1 = Fragment1.newInstance()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fcv_main_activity, fragment1)
                .addToBackStack(null)
                .commit()
        }
    }

    companion object {
        fun newInstance(): Fragment2 {
            return Fragment2()
        }
    }
}