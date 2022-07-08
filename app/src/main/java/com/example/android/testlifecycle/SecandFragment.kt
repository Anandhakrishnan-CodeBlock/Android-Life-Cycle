package com.example.android.testlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecandFragment : Fragment()
{

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        Log.d("onAttach","F2")
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","F2")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secand, container, false)
        Log.d("onCreateView","F2")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("onActivityCreated","F2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","F2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","F2")

    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","F2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","F2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView","F2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","F2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach","F2")
    }

}