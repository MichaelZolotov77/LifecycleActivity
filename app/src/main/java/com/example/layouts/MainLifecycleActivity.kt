package com.example.layouts



import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.core.app.ActivityCompat
import com.example.layouts.databinding.ActivityMainLifecycleBinding


class MainLifecycleActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate, savedState=$savedInstanceState")

        binding = ActivityMainLifecycleBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.showAnotherActivityButton.setOnClickListener {
            startActivity(Intent(this, SecondaryLifecycleActivity::class.java))
        }

        binding.showTransparentActivityButton.setOnClickListener {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),1)
        }

        binding.minimizeAppButton.setOnClickListener {
            moveTaskToBack(false)
        }
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
        val TAG = MainLifecycleActivity::class.simpleName
    }
}