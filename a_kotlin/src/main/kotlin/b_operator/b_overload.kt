package b_operator

data class User(
    val email:String,
    val password:String
) {
    operator fun get(key: String):Any? {
        return User::class.members.find{it.name==key}?.call(this)
    }
}

fun main() {
    val user = User("kyw@gmail.com", "1234")
    println(user)
}