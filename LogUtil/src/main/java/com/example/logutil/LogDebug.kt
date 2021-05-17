package com.example.logutil
import android.content.Context
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

object LogDebug {
    public  fun makeLogger(context : Context, message: String){
        Log.d("LogUtil",message)
        Toast.makeText(context,message,LENGTH_LONG).show()
    }
}