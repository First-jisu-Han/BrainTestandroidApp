package com.brain.BrainTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_selection1.*

class Selection1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection1)

        var name= intent.getStringExtra("name")




        button3.setOnClickListener {
            var rightCount: Int = 0
            var leftCount: Int = 0
            when(radioGroup.checkedRadioButtonId){
                R.id.rightRadio->rightCount+=1
                R.id.leftRadio->leftCount+=1
            }
            val intent = Intent(this, Selection2::class.java)
            intent.putExtra("Rightradio", rightCount.toInt())
            intent.putExtra("Leftradio", leftCount.toInt())
            intent.putExtra("name",name)
            startActivity(intent)
        }








}}