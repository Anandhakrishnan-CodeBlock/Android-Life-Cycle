package com.example.android.testlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment()
{

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        Log.d("onAttach","F1")
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","F1")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
        Log.d("onCreateView","F1")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("onActivityCreated","F1")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","F1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","F1")

    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","F1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","F1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView","F1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","F1")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach","F1")
    }
}