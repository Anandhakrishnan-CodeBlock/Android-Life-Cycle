package com.example.android.testlifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class View_Model: ViewModel()
{
    var vm_value = 0
    var live_data: MutableLiveData<Int> = MutableLiveData()


    fun add()
    {
        CoroutineScope(IO).launch {
        }
        vm_value += 1
        live_data.value = vm_value
    }

    fun sub()
    {
        vm_value -= 1
        live_data.value = vm_value
    }
}

