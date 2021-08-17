package com.brain.BrainTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_right_brain.*

class RightBrain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_brain)

        if(intent.hasExtra("name")) {
            textView13.text = intent.getStringExtra("name")
            textView44.text = intent.getStringExtra("name")



        }
            button8.setOnClickListener(){
                ActivityCompat.finishAffinity(this)
                System.exit(0)
            }

}}