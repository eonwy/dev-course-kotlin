package e_oop.f_object

// singleton 으로 생성되는 객체
// 생성자를 가질 수 없다.
object JdbcTemplate {
    const val user: String = "admin"
    val password: String = "1234"

    fun connect(){
        println("연결")
    }

    fun commit(){
        println("commit")
    }
}

fun main(){
    println(JdbcTemplate.user)
    println(JdbcTemplate.password)
    JdbcTemplate.commit()
    JdbcTemplate.connect()
}