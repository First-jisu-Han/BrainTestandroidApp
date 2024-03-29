package com.brain.BrainTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_selection1.radioGroup
import kotlinx.android.synthetic.main.activity_selection2.*

class Selection2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=
        setContentView(R.layout.activity_selection2)

        var rightCount=0
        var leftCount=0

        var name= intent.getStringExtra("name")


        rightCount = intent.getIntExtra("Rightradio", 0)
        leftCount = intent.getIntExtra("Leftradio", 0)

        button.setOnClickListener(){

            when(radioGroup.checkedRadioButtonId){
                R.id.rightRadio->rightCount++
                R.id.leftRadio->leftCount++
            }

            val intent=Intent(this,Selection3::class.java)
            intent.putExtra("Rightradio",rightCount.toInt())
            intent.putExtra("Leftradio",leftCount.toInt())
            intent.putExtra("name",name)

            startActivity(intent)
        }












    }
}