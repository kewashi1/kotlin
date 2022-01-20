package com.example.demo.service

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service
import org.springframework.web.servlet.function.ServerResponse.async

@Service
class CoroutineService {

    fun coroutineTest(){
        runBlocking {
            val result = async{
                delay(1000L)
                var sum = 0
                for(i in 1..10){
                    sum += i
                }
                sum
            }
            println("計算中!")
            println("sum=${result.await()}")
        }
    }

}