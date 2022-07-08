package com.example.android.testlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.testlifecycle.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("onCreate","A1")


    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","A1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","A1")

        val viewModel = ViewModelProvider(this).get(View_Model::class.java)

        viewModel.live_data.observe(this, Observer {
            binding.value.text = it.toString()
        })

        binding.move.setOnClickListener {
            val intent = Intent(this, SecandActivity::class.java)
            startActivity(intent)
        }

        binding.add.setOnClickListener {
            viewModel.add()
        }

        binding.sub.setOnClickListener {
            viewModel.sub()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart","A1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","A1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","A1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","A1")
    }
}


