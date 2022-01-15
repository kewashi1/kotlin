package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/sample")
    fun getHello() :String {

        println(sum(1,2));

        val array = arrayOf(1,2,3);
        for(item in array){
            println(item)
        }

        var res = 5.test(6);
        println(res)



        return "test Hello World"
    }

    fun sum(a:Int, b:Int): Int{

        if (a == 1){
            return 1;
        }

        return a + b;
    }

    fun Int.test(num:Int): Int{
        return this + num;
    }

    val test2: Int.(Int) -> Int = fun Int.(num): Int{
        return this + num
    }
}