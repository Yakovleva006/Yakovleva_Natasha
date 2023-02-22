package com.example.yakovleva_natasha

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //ОбЪявление переменных
    private var text: String = " В магазине <осталось> 10 банок колы ,а может и больше"//Стока, у каждого элемента есть свой номер который начинается с 0
    private var text2: String = "я <купила> себе куклу в детском магазине"
        private var tvText: TextView? = null;  //Создали переменную для Textview




        @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
               setContentView(R.Lay)
               var subText: String = text.substringAfter('<')
                var subText2: String = subText.substringBefore('>')
                //Отобразить содержимое переменной tvText на компоненте tvTextView
                tvText?.setText(subText2)



    }




       }

