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
            val intent = Intent(this, Selection1::class.java) // intent는 selection1으로 넘어감
            intent.putExtra("name", mainName.text.toString())    // intent에 name이라는 이름으로 변수를 담고, 버튼안의 이름을 넣음
            startActivity(intent) // intent 시작
            finish()
        }
    }
}