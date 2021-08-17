package com.brain.BrainTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        mainStart.setOnClickListener {
            val intent=Intent(this,Selection1::class.java)
            intent.putExtra("name",mainName.text.toString())      //intent에 mainName의 내용을 담는다
            startActivity(intent)
            finish()
        }









    }
}