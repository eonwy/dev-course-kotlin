package e_oop.e_dataclass

// data class 값을 저장하기 위한 class
// toString, equals, hashCode, 구조분해할당이 가능하다
// 반드시 주 생성자의 매개변수가 1개 이상 있어야 한다.
// final class 로만 사용 가능
data class User(
    val email: String,
    val password: String
)

fun main(){
    val test = User("test@grepp.com", "1234")
    val test2 = test.copy()
    val admin = test.copy(email = "admin@grepp.com")

    // toString
    println(test)

    // 값 기반 으로 equals override
    println(test == test2)

    // 값 기반 으로 hashCode override
    println(test.hashCode())
    println(test2.hashCode())

    // copy() : 불변성을 유지하며 값을 변경
    println(admin)

    // componentN() : 구조분해할당
    val (email, password) = admin
    println("email: $email, password: $password")
}


