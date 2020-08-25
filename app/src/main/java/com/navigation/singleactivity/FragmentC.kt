package com.navigation.singleactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.navigation.singleactivity.databinding.FragmentCBinding
import kotlinx.android.synthetic.main.fragment_c.*

class FragmentC : Fragment() {

    val args: FragmentCArgs by navArgs()

    //**********************************************************************************************
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCBinding.inflate(inflater, null, false)

        return binding.root
    }

    //**********************************************************************************************
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textTitle.text = args.title

        val sampleDataModel = args.sampleDataModel

        sampleDataModel.let {
            textFullName.text = it.getFullName()
        }

    }

}