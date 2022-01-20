package com.example.demo

import com.example.demo.service.CoroutineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CoroutineController {

    @Autowired
    lateinit var coroutine: CoroutineService

    @GetMapping("/coroutine")
    fun getHello() :String {
        coroutine

        return "coroutine"
    }

}