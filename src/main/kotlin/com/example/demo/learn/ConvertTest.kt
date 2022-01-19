package com.example.demo.learn

import com.example.demo.learn.BeanConvert
import java.util.ArrayList

class ConvertTest {
    fun testConverter(): List<BeanConvert> {
        val list: MutableList<BeanConvert> = ArrayList()
        val bean = BeanConvert()
        list.add(bean)

        a()
        var aaa = calcTest(10,20,{num1, num2->num1 * num2})
        println("aaa = $aaa")
//        testWith()
        testApply()

        return list
    }

    fun a(){
        val test: (Int, Int) -> Int = {test1: Int, test2: Int -> test1 + test2}
        println(test(10,20))
    }


    fun calcTest(num1: Int, num2: Int, calc: Calc): Int {
        return calc(num1, num2)
    }

    fun testWith(){
        val addNum = with(mutableListOf<Int>()){
            for(i in 1.. 10){
                this.add(i)
            }
            this.joinToString(separator = " ")
        }
        println(addNum)
    }

    fun testApply(){
        val addNumApply = mutableListOf<Int>().apply {
            for(i in 1.. 10){
                this.add(i)
            }
        }
        println(addNumApply)
    }
}

typealias Calc = (Int, Int) -> Int
