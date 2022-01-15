package com.example.demo.learn

class User5 {
    var address: String = ""
    var name: String = ""
        set(value) {
            if(value == ""){
                field = "kotlin"
            }else{
                field = value
            }
        }

}