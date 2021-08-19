package com.nepplus.kolinbasic_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        logBtn02.setOnClickListener {

            Log.d("메인화면", "두번째 로그 버튼 눌림")

        }




        toastBtn.setOnClickListener {

            //사용자에게 알림 (토스트) 띄우기
            Toast.makeText(this, "연습용 토스트 띄우기", Toast.LENGTH_SHORT).show()

        }

        logBtn01.setOnClickListener {

            //무슨 말을 적어도 괜찮다. (메모 - 주석)
            //Ctrl + / : 주석을 다는 단축키

            Log.d("메인화면", "첫번째 로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어봄")
            Log.i("메인화면", "i로 로그 찍기")


        }

        //조건문 체험 부분

        var userAge = 18

        if (userAge >=20 ) {

            Log.d("나이확인", "성인입니다")

        }

        else if ( userAge >=17) {








            Log.d("나이확인", " 고등학생 입니다.")

        }

        else if ( userAge >=14) {
            Log.d("나이확인", "중학생 입니다.")


        }

        else if ( userAge >=8) {
            Log.d("나이확인",  "초등학생 입니다.") }

        else {
            Log.d("나이확인", "미취학 아동 입니다.")

        }

//장기 근속의 3대 요건
//        1. 높은 급여
//                2. 가까운 거리
//                3. 워라벨


        val companyASalary = 5800
        val companyADistance = 12.5
        val companyABalance = true

        //질문 1. 연봉이 4천 이상이면 취업

        if( companyASalary >=4000) {
            //연봉 높아서 취업

        }

        //사람2. 거리가 10km미만 AND 연봉 3000 이상

        if ( companyADistance < 10 && companyASalary >= 3000) {


        }


        //사람3. 워라벨이 ok 거나, 연봉이 5천 이상

        if (companyABalance || companyASalary >= 5000 ) {

            }
        }

    }
}