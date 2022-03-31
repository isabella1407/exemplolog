package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        Log.i("---","on resume executando")
    }

    override fun onStart() {
        super.onStart()
        Log.i("---","on start executando")


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("---","on destroy executando")
    }

}