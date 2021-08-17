package com.brain.BrainTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_selection4.*
import kotlinx.android.synthetic.main.activity_selection5.*
import kotlinx.android.synthetic.main.activity_selection7.*
import kotlinx.android.synthetic.main.activity_selection4.radioGroup as radioGroup1
import kotlinx.android.synthetic.main.activity_selection7.radioGroup as radioGroup1

class Selection7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection7)

        var name= intent.getStringExtra("name")

        var rightCount=0
        var leftCount=0

        rightCount = intent.getIntExtra("Rightradio", 0)
        leftCount = intent.getIntExtra("Leftradio", 0)


        button7.setOnClickListener(){

            when(radioGroup.checkedRadioButtonId){
                R.id.rightRadio->rightCount+=1
                R.id.leftRadio->leftCount+=1
            }

            if(rightCount>leftCount){
                val intent= Intent(this,LeftBrain::class.java)
                intent.putExtra("name",name)
                startActivity(intent)
            }
            if(rightCount<leftCount){
                val intent= Intent(this,RightBrain::class.java)
                intent.putExtra("name",name)
                startActivity(intent)
            }
        }


    }
}