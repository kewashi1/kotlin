package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class TextService {

    // 拡張関数
    fun square(num1: Int, num2: Int): Int = num1 * num2

    fun testSquare(){
        println(square(2, 5))
    }

    // スコープ関数let
    fun testLet(str: String?){
        var res = str?.let { str.equals("ok") }

        println("res = $res")
        println("str = $str")
    }
}