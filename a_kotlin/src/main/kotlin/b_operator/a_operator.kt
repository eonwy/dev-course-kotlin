package b_operator

fun main(){
    // 산술연산자, 논리연산자, 복합대입연산자 : 자바와 동일

    // 비교연산자
    // ==, !=, ===, !==, >, <, >=, <=

    // 값 동등성(==, !=) : 객체에 담긴 값이 같은 지 확인 (equals)
    // 참조 동등성 (===, !==) : 두 객체의 메모리 주소가 같은 지 확인

    val arr1 = listOf(1,2,3)
    val arr2 = listOf(1,2,3)

    println(arr1 == arr2)
    println(arr1 === arr2)
}