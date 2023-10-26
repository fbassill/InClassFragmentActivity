package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()

       findViewById<Button>(R.id.button).setOnClickListener {
            (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as ImageDisplayFragment)
                .setImages(imageArray)
        }


        // Attach an instance of ImageDisplayFragment using factory method
        //val imageDisplay = ImageDisplayFragment.newInstance(imageArray)
        /*
        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) !is ImageDisplayFragment) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView, imageDisplay)
                .addToBackStack(null)
                .setReorderingAllowed(true)
                .commit()
        }
         */
    }
}