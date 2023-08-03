package com.example.prac2_mad_a3_58

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("Oncreate")
    }

    override fun onStart() {
        super.onStart()
        displayMessage("OnStart")
    }

    override fun onResume() {
        super.onResume()
        displayMessage("OncResume")
        
    }

    override fun onPause() {
        super.onPause()
        displayMessage("OnPause")
    }
    override fun onStop() {
        super.onStop()
        displayMessage("OnSTOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("OnDestroy")
    }

    fun displayMessage(msg:String){
        Toast.makeText(this,"$msg" , Toast.LENGTH_SHORT).show()
        Log.i(TAG,"Log message")
        Snackbar.make(
            findViewById(R.id.cl1),
            R.string.email_sent,
            Snackbar.LENGTH_SHORT
        ).show()
    }
}