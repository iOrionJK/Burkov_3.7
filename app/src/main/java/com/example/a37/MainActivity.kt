package com.example.a37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById<FrameLayout>(R.id.fragment)
        val t:TestFragment = TestFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, t)
            .commit()
        b.setOnClickListener(){
            FlagDialog(t).show(supportFragmentManager, "")
        }
    }

}