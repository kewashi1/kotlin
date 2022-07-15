package com.example.demo

import com.example.demo.learn.Animal
import com.example.demo.learn.ConvertTest
import com.example.demo.learn.Dog
import com.example.demo.service.CoroutineService
import com.example.demo.service.TextService
import com.example.demo.service.TopService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopController {

    @Autowired
    lateinit var topService: TopService;
    @Autowired
    lateinit var textService: TextService;
    @Autowired
    lateinit var coroutine: CoroutineService;

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

//        textService.testSquare()
//        textService.testLet(null)
//        textService.testLet("ok")
        coroutine.coroutineTest()

//        var conv = ConvertTest()
//
//        conv.testConverter()

        return res[0];
    }
}