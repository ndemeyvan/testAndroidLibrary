package com.example.loguiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logutil.LogDebug
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastButton.setOnClickListener {
            LogDebug.makeLogger(this, "Hello from log debug")
        }

    }
}