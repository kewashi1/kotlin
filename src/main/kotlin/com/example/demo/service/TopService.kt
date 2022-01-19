package com.example.demo.service

import com.example.demo.learn.User5
import com.example.demo.learn.User7
import org.springframework.stereotype.Service

@Service
class TopService {

    fun doSomething(): Array<String>{

        var a = arrayOf("1")

//        var user = User5()
//        user.name = ""
//        user.address = ""
//        println(user.name)
//        println(user.address)
//        user.name = "testName"
//        user.address = "testAddress"
//        println(user.name)
//        println(user.address)

//        var user7 = User7(11, "user1")
//        println(user7.name)
//        println(user7.id)
//
//        var testUser7 = User7(11, "user2")
//
//        println(user7.name.equals(testUser7.name))
//        println(user7.id.equals(testUser7.id))

        return a
    }

    fun test(): List<String>{
        var a = listOf<String>("a", "b", "c")

        for(item in a){
            println(item)
        }
        return a
    }

    fun testNull(str: String? ): Unit{
        println(str?.length)
    }

    fun testIf(num: Int): String{
        var res = if(num % 2 == 1){
            "奇数"
        }else{
            "偶数"
        }
        return res
    }

    fun addFunctionForTest(): Int{
        return 1
    }

}