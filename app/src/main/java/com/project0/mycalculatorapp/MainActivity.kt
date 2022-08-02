package com.project0.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var first_number:EditText = findViewById(R.id.mEdtFnum)
        var second_number:EditText = findViewById(R.id.mEdtSnum)
        var my_answer:TextView = findViewById(R.id.mTvAnswer)

        var ongeza:Button = findViewById(R.id.mBtnAdd)
        ongeza.setOnClickListener {
            var f_num = first_number.text.toString().trim()
            var s_num = second_number.text.toString().trim()
            if (f_num.isEmpty()){
                first_number.setError("Please Fill This input")
                first_number.requestFocus()
            }else if(s_num.isEmpty()){
                second_number.setError("Please Fill This Input")
                second_number.requestFocus()
            }else{
                //Continue Doing The Calculation
                var calculatable_f_num = f_num.toDouble()
                var calculatable_S_num = s_num.toDouble()
                var answer = calculatable_f_num + calculatable_S_num
                my_answer.text = answer.toString()

            }

        }
        var ondoa:Button = findViewById(R.id.mBtnSubtract)
        ondoa.setOnClickListener {
            var f_num = first_number.text.toString().trim()
            var s_num = second_number.text.toString().trim()
            if (f_num.isEmpty()){
                first_number.setError("Please Fill This input")
                first_number.requestFocus()
            }else if(s_num.isEmpty()){
                second_number.setError("Please Fill This Input")
                second_number.requestFocus()
            }else{
                //Continue Doing The Calculation
                var calculatable_f_num = f_num.toDouble()
                var calculatable_S_num = s_num.toDouble()
                var answer = calculatable_f_num - calculatable_S_num
                my_answer.text = answer.toString()

            }
        }
        var gawa:Button = findViewById(R.id.mBtnDivide)
        gawa.setOnClickListener {
            var f_num = first_number.text.toString().trim()
            var s_num = second_number.text.toString().trim()
            if (f_num.isEmpty()){
                first_number.setError("Please Fill This input")
                first_number.requestFocus()
            }else if(s_num.isEmpty()){
                second_number.setError("Please Fill This Input")
                second_number.requestFocus()
            }else{
                //Continue Doing The Calculation
                var calculatable_f_num = f_num.toDouble()
                var calculatable_S_num = s_num.toDouble()
                var answer = calculatable_f_num / calculatable_S_num
                my_answer.text = answer.toString()

            }
        }
        var zidisha:Button = findViewById(R.id.mBtnMultiply)
        zidisha.setOnClickListener {
            var f_num = first_number.text.toString().trim()
            var s_num = second_number.text.toString().trim()
            if (f_num.isEmpty()){
                first_number.setError("Please Fill This input")
                first_number.requestFocus()
            }else if(s_num.isEmpty()){
                second_number.setError("Please Fill This Input")
                second_number.requestFocus()
            }else{
                //Continue Doing The Calculation
                var calculatable_f_num = f_num.toDouble()
                var calculatable_S_num = s_num.toDouble()
                var answer = calculatable_f_num * calculatable_S_num
                my_answer.text = answer.toString()

            }
        }
    }
}