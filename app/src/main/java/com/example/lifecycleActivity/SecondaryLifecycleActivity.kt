package com.example.lifecycleActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondaryLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MainLifecycleActivity.TAG,"onCreate, savedState=$savedInstanceState")
        setContentView(R.layout.activity_secondary)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState")
    }

    companion object {
        val TAG = SecondaryLifecycleActivity::class.simpleName
    }
}