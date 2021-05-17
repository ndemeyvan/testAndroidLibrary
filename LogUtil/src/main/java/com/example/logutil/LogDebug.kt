package com.example.logutil
import android.util.Log


public class LogDebug {

  public fun makeLogger(message: String){
      Log.d("LogUtil",message)
  }

}