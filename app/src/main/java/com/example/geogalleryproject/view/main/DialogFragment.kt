package com.example.geogalleryproject.view.main

import android.app.DialogFragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.geogalleryproject.R

  class DialogFragment :   DialogFragment () {


      override fun onCreateView(
          inflater: LayoutInflater, container: ViewGroup?,
          savedInstanceState: Bundle?
      ): View? {
          // Inflate the layout for this fragment
          return inflater.inflate(R.layout.fragment_dialog, container, false)
      }

  }