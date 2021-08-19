package com.nepplus.kolinbasic_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn02.setOnClickListener {

            Log.d("메인화면", "두번째 로그 버튼 눌림")

        }

        logBtn01.setOnClickListener {

            //무슨 말을 적어도 괜찮다. (메모 - 주석)
            //Ctrl + / : 주석을 다는 단축키

            Log.d("메인화면", "첫번째 로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어봄")
            Log.i("메인화면", "i로 로그 찍기")


        }



    }
}