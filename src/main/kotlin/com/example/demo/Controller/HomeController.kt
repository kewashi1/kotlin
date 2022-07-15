package com.example.demo.Controller

import com.example.demo.bean.HomeEntity
import com.example.demo.service.HomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


/**
 * TOPページController
 */
@RestController
class HomeController {

    @Autowired
    lateinit var homeServie : HomeService

    @GetMapping("/home")
    fun homeController(): HomeEntity{

        var list: List<HomeEntity> = homeServie.getHomeInfo()

        println("ok")

        var HomeEntity = HomeEntity("aaa")
        return HomeEntity
    }

}