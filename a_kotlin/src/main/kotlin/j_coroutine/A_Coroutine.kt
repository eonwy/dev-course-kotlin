package j_coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit

fun main(){
    println("main start")
    //studyCoroutine()
    //studyAsync()
    //studyDispatcher()
    studySemaphore()
    println("main end")
}

// runBlocking : 내부 비동기로 동작하는 coroutine 이 종료될 때 까지
// studyCoroutine 함수를 정지
fun studyCoroutine() = runBlocking{
    println("coroutine 시작")

    val job = launch {
        delay(1000) // 1초 동안 코루틴 일시 정지
        println("Coroutine 진행 ")
    }

    job.join()
    println("coroutine 종료")
}

fun studyAsync() = runBlocking {

    val defferdSum1 = async{
        delay(1000)
        100 + 200
    }

    val defferdSum2 = async{
        delay(1000)
        200 + 200
    }

    val result1 = defferdSum1.await()
    println("100 + 200 = $result1")
    val result2 = defferdSum2.await()
    println("200 + 200 = $result2")
}

fun studyDispatcher() = runBlocking {
    // CPU 집약적인 작업
    launch(Dispatchers.Default) {
        println("Default Dispatcher : ${Thread.currentThread().name}")
    }

    // I/O 전용 작업
    launch(Dispatchers.IO) {
        println("IO Dispatcher : ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println("withContext Default Dispatcher : ${Thread.currentThread().name}")
        withContext(Dispatchers.IO){
            println("withContext IO Dispatcher : ${Thread.currentThread().name}")
        }
    }

    // 현재 스래드 시작
    launch (Dispatchers.Unconfined){
        println("Unconfined Dispatcher : ${Thread.currentThread().name}")
        delay(1000)
        println("Unconfined Dispatcher : ${Thread.currentThread().name}")
    }
}

suspend fun doWork(id: Int){
    println("worker $id")
    delay(1000)
}

fun studySemaphore() = runBlocking{
    val semaphore = Semaphore(3)
    listOf(1,2,3,4,5,6,7,8,9).forEach {
        launch{
            semaphore.withPermit {
                doWork(it)
            }
        }
    }
}








