package com.geeks.nurkyz_chomoeva_hw3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geeks.nurkyz_chomoeva_hw3_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(viewBinding.root)

    }
}