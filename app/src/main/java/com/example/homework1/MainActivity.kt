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
            Log.e("@!&","Button #1 have been pressed")
            textView.setText("Button 1 pressed")
        }
        button2.setOnClickListener {
            Log.e("@!&","Button #2 have been pressed")
            textView.setText("Button 2 pressed")
        }
        button3.setOnClickListener {
            Log.e("@!&","Button #3 have been pressed")
            textView.setText("Button 3 pressed")
        }
        button4.setOnClickListener {
            Log.e("@!&","Button #4 have been pressed")
            textView.setText("Button 4 pressed")
        }



    }



}