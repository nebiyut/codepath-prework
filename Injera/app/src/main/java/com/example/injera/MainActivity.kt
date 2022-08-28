package com.example.injera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Blacksburg","Tapped on Button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_200))
        }
    }
}