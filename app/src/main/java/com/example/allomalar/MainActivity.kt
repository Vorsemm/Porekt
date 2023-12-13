package com.example.allomalar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<FrameLayout>(R.id.iteamNavoiy).setOnClickListener {openInfo(1)}
        findViewById<FrameLayout>(R.id.iteamBeruniy).setOnClickListener {openInfo(2)}
        findViewById<FrameLayout>(R.id.iteamUlugbek).setOnClickListener {openInfo(3)}
        findViewById<FrameLayout>(R.id.iteamBobur).setOnClickListener {openInfo(4)}

    }
    private fun openInfo(nubmer: Int){
        val intent = Intent(this, infoActivity::class.java)
        intent.putExtra("NUMBER", nubmer)
        startActivity(intent)
    }
}