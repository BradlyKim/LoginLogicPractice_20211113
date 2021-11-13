package com.nepplus.loginlogicpractice_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputID.setOnClickListener {


            val userAge = admin



            if(userAge == admin){

                Log.d("조건문01", "성인입니다.")
            }

            else if (userAge >= 17) {
//                성인이 아리고, 질문 -> 17살 이상인가?
                Log.d("조건문01", "고등학생입니다.")

            }

            else if (userAge >= 14) {
//                성인이 아니고, 고등학생도 아닐때 질문
                Log.d("조건문01", "중학생입니다.")
            }

            else {
                Log.d("조건문01", "초등학생이거나, 미취학 아동입니다. ")
            }


        }
    }
}