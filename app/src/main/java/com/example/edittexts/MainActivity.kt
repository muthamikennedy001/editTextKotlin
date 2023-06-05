package com.example.edittexts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdd=findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val firstNumber=findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
            val secondNumber=findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()
            val result=firstNumber+secondNumber
            var tvResult=findViewById<TextView>(R.id.tvResult)
            tvResult.text=result.toString()
        }
    }
}