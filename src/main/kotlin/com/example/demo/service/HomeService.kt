package com.example.demo.service

import com.example.demo.bean.HomeEntity
import org.springframework.stereotype.Service

@Service
class HomeService {

    fun getHomeInfo() : List<HomeEntity>{
        val list = mutableListOf<HomeEntity>()
//        var entity1: HomeEntity = HomeEntity("ichi", 1)
//        var entity2: HomeEntity = HomeEntity("ni", 2)


        return list
    }
}