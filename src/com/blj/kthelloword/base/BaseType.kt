package com.bailiangjin.kotlinhelloworld.base

/**
 * Created by bailiangjin on 2017/6/21.
 */


fun main(args: Array<String>) {

    //Base type
    val vDouble: Double = 64.0
    val vFloat: Float = 32.0F
    val vLong: Long = 32L
    val vInt: Int = 32
    val vShort: Short = 16
    val vByte: Byte = 8




    // Demo for Base type
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010



    val a: Int = 10000
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！





}