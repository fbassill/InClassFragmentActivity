package edu.temple.inclassactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImagesViewModel : ViewModel() {

    private val images = MutableLiveData<IntArray>()

    fun setImage(newImages: IntArray) {
        images.value = newImages
    }

    fun getImages() : LiveData<IntArray>{
        return images
    }
}