package a_type

// 코틀린은 순수객체지향프로그래밍언어 primitive type 없다.
// 1. Any : 최상위 부모 클래스
// 2. Nothing : 최하위 타입, 절대로 발생할 수 없는 값 표현

// 코틀린은 순수객체지향프로그래밍언어 primitive type 없다.
// 1. Any : 최상위 부모 클래스
// 2. Nothing : 최하위 타입, 절대로 발생할 수 없는 값을 표현
//             Nothing 을 반환하는 함수는 무조건 예외를 던지거나, 영원히 멈추지 않음
// 3. Unit : void, 리턴값이 없는 함수는 Unit 을 반환
fun main(){
    // val (value) : 수정이 불가능한 변수
    // var (variable) : 변수

    // Byte, Short, Int, Long, Float, Double
    val xByte: Byte = 1
    val xShort: Short = 10
    val xInt: Int = 100
    val xLong: Long = 10000000000
    val xFloat: Float = 11.11f
    var xDouble: Double = 110.11
    xDouble = 1000.111

    // String
    val xChar: Char = 'A'
    val xString: String = "Hello Kotlin"

    // Boolean
    val xBoolean = true
    println(xBoolean::class.simpleName)

    // nullable
    // 코틀린의 타입은 기본으로 none null type
    val nullable: String? = null

    // ?. : NPE 대신 null 을 반환해준다
    println(nullable?.length)

    // nullable smart cast
    if(nullable != null){
        println(nullable.length)
    }
}