package com.reptilefury.image_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.reptilefury.image_view.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val firstImage = getDrawable(R.drawable.sunny_image)
        val secondImage = getDrawable(R.drawable.storm_image)
        change_button.setOnClickListener {

            val image = binding.imageView1

            if (image.tag == "sunny_image") {
                image.setImageResource(R.drawable.storm_image)
                //image.background = secondImage
                image.tag = "storm"
            } else {
                image.setImageResource(R.drawable.sunny_image)
                //image.background = firstImage
                image.tag = "sunny_image"
            }
            /*
                if(binding.imageView1.background == firstImage){
                    binding.imageView1.background = secondImage
                } else{
                    binding.imageView1.background = firstImage
                }*/
        }
    }
}