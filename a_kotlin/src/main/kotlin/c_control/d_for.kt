package c_control

fun main(){
    val list = listOf("hello", "kotlin", "for", "loop")
    for (word in list){
        println(word)
    }

    println("=======================")

    val text = "Kotlin"
    // 문자열 순회
    for(ch in text){
        println(ch)
    }

    for((index, word) in list.withIndex()){
        // String template
        println("$index 인덱스 : $word")
    }

    println("==========================")

    for((index, word) in list.withIndex()){
        println("${index + 1} 번 : $word")
    }

    println("==========================")

    // n 회차 반복
    for(i in 1..5){
        println("$i 번")
    }

    println("==============================")
    // 알파벳 a to c
    for(ch in 'a' .. 'c'){
        println("$ch !!")
    }

    println("======================")
    // 5 제외
    for(i in 0 until 5){
        println(i)
    }

    // 10부터 1까지 3씩 감소
    for(i in 10 downTo 1 step 3){
        print("$i ")
    }



}