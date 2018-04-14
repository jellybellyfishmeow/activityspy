package edu.washington.yangj9.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null) {
            Log.i(tag, "onCreate event fired")
        } else {
            Log.i(tag, "onCreate event fired" + savedInstanceState.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "We’re going down, Captain!")
        Log.i(tag, "onDestroy fired")
    }
}
