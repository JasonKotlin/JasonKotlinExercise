package com.example.jasonkotlin

fun main(){
    var i = 10;
    println(i)
    println("===========================")
    val t = Test()
    t.Hello()
}

class Test(){
    fun Hello(){
        println("Oh! My God")
    }
}