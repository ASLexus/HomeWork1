package com.example.homework1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.e("@!&","Click on but1!")
        }
        button2.setOnClickListener {
            Log.e("@!&","Click on but2!")
        }
        button3.setOnClickListener {
            Log.e("@!&","Click on but3!")
        }
        button4.setOnClickListener {
            Log.e("@!&","Click on but4!")
        }



    }



}