package com.example.project.ui.assets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AssetsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is assets Fragment"
    }
    val text: LiveData<String> = _text
}