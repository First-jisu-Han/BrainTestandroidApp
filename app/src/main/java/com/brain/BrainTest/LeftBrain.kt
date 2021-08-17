package com.brain.BrainTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_left_brain.*

class LeftBrain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_brain)

        if(intent.hasExtra("name")){
            textView10.text= intent.getStringExtra("name")
            textView21.text=intent.getStringExtra("name")


        }


            button9.setOnClickListener(){
            ActivityCompat.finishAffinity(this)
            System.exit(0)
        }
    }
}