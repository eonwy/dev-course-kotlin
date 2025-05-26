package c_control

fun main(){
    expression()
}

fun statement(){
    print("과일 이름 : ")
    val fruit = readln()

    when(fruit){
        "APPLE" -> println("사과")
        "BANANA" -> println("바나나")
        else -> println("등록되지 않은 단어입니다.")
    }
}

fun expression(){
    print("과일 이름 : ")
    val fruit = readln()
    val kor = when(fruit){
        "APPLE" -> "사과"
        "BANANA" -> "바나나"
        else -> "NONE"
    }

    println(kor)
}