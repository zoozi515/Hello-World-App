package com.example.helloworldapp_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1 : Int = 5
        var number2 : Int = 10
        var operator : String = "+"

     /*   println("Enter first number: ")
        number1 = readLine()!!.toInt()

        println("Enter second number: ")
        number2 = readLine()!!.toInt()

        println("Enter the operator: ")
        operator = readLine().toString() */


        calc(number1, number2, operator)
    }

    fun calc(num1: Int, num2: Int, op: String?){
        var result : Int = 0
        if (op == "+")
                result = num1 + num2
        else if(op == "-")
            result = num1 - num2
        else if(op == "*")
            result = num1 * num2
        else if(op == "/")
            result = num1 / num2

        print("$num1 $op $num2 = $result\n")
    }
}