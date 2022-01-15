package com.example.demo

import com.example.demo.learn.Animal
import com.example.demo.learn.Dog
import com.example.demo.service.TopService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopController {

    @Autowired
    lateinit var topService: TopService;

    @GetMapping("/")
    fun getTop(): String {
        var res = topService.doSomething();
//        topService.test()
//        topService.testNull(null)
//        topService.testNull("test")
//
//        val animal = Animal("test")
//        animal.cries()
//        val dog = Dog("test")
//        dog.cries()
//
//        var result: String = topService.testIf(2)
//        println(result)

        return res[0];
    }
}