package com.example.rgb

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.graphics.drawable.toDrawable
import com.example.rgb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var redInt : Int = 0
    private var greenInt : Int = 0
    private var blueInt : Int = 0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.slider.addOnChangeListener { slider, value, fromUser ->
            val red=ColorStateList.valueOf(Color.rgb(value,0f,0f))
            slider.thumbTintList = red
            slider.trackTintList = red
            slider.tickTintList = red

            redInt = Color.rgb(value,0f,0f)

            binding.frameLayout.background = Color.rgb(redInt,greenInt,blueInt).toDrawable()
        }
        binding.slider2.addOnChangeListener { slider, value, fromUser ->
            val green = ColorStateList.valueOf(Color.rgb(0f,value,0f))
            slider.thumbTintList = green
            slider.trackTintList = green
            slider.tickTintList = green

            greenInt = Color.rgb(0f,value,0f)

            binding.frameLayout.background = Color.rgb(redInt,greenInt,blueInt).toDrawable()
        }
        binding.slider3.addOnChangeListener { slider, value, fromUser ->
            val blue = ColorStateList.valueOf(Color.rgb(0f,0f,value))
            slider.thumbTintList = blue
            slider.trackTintList = blue
            slider.tickTintList = blue

            blueInt = Color.rgb(0f,0f,value)

            binding.frameLayout.background = Color.rgb(redInt,greenInt,blueInt).toDrawable()
        }



    }
}