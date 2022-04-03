package com.coroutine.basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // launch : 자신을 호출한 쓰레드를 blocking 하지 않음
    GlobalScope.launch {
        delay(2000L)
        println("World!")
    }

    println("Hello,")
    // runBlocking : 코루틴 빌더, 쓰레드를 blocking
    runBlocking {
        delay(5000L)
    }
    println("test")
}
