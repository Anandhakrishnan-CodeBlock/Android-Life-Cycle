package com.example.android.testlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.android.testlifecycle.databinding.ActivityMainBinding
import com.example.android.testlifecycle.databinding.ActivitySecandBinding

class SecandActivity : AppCompatActivity()
{
    private lateinit var binding: ActivitySecandBinding
    val firstfragments = FirstFragment()
    val secandfragments = SecandFragment()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivitySecandBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("onCreate","A2")

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framefragment,firstfragments)
            commit()
        }

        binding.frm1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framefragment,firstfragments)
                commit()
            }
        }

        binding.frm2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framefragment,secandfragments)
                commit()
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","A2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","A2")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart","A2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","A2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","A2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","A2")
    }
}