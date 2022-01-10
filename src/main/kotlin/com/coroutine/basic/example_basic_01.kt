package com.coroutine.basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    // launch : 코루틴 빌더 즉, 내부적으로 코루틴을 만들고 해당 코루틴을 반환 (내부 코드 참고)
    // 코루틴 빌더에서 코루틴이 만들어지고 해당 블럭안에서 코루틴이 실행된다.
    // 코루틴은 경량 쓰레드이다.
    GlobalScope.launch {
        // delay() : 코루틴이 일시 중단(suspend)되는 형태
        delay(1000L)
        println("World!")
    }

    println("Hello",)
    // sleep() : 메인 쓰레드가 blocking 되는 형태
    Thread.sleep(2000L)
}
