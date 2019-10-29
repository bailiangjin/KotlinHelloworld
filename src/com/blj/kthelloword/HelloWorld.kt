package com.blj.kthelloword

//fun main(args: Array<String>) {
//    println("Hello World")
//
//    var a = 1
//    var b = 2
//
//
//    var max = if (a > b) a else b
//
//    println(max)
//
//    when (max) {
//        1 -> print("x==1")
//        2 -> print("x==2")
//        else -> {
//            print("max is neither 1 nor2 ")
//
//        }
//    }
//}


/**
 * Kotlin Hello World
 *
 * @author liangjin.bai
 * @date 2019-10-29
 */
class HelloWorld {

    val helloWorldStr: String = "Kotlin Hello World";



}

fun main(args: Array<String>) {
    println(HelloWorld().helloWorldStr)
}