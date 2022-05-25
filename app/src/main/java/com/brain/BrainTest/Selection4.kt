package com.brain.BrainTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_selection4.*
import kotlinx.android.synthetic.main.activity_selection4.radioGroup

class Selection4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection4)

        var name= intent.getStringExtra("name")




        var rightCount=0
        var leftCount=0
        rightCount = intent.getIntExtra("Rightradio", 0)
        leftCount = intent.getIntExtra("Leftradio", 0)

        button4.setOnClickListener(){
            when(radioGroup.checkedRadioButtonId){
                R.id.rightRadio->rightCount++
                R.id.leftRadio->leftCount++
            }

            val intent=Intent(this,Selection5::class.java)
            intent.putExtra("Rightradio",rightCount.toInt())
            intent.putExtra("Leftradio",leftCount.toInt())
            intent.putExtra("name",name)



            startActivity(intent)
        }




    }
}