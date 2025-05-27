package g_nullcheck

var name:String? = null
var kyw:Student? = Student(name)

class Student(
    var name:String?,
    val age:Int? = 10
){

}

fun main(){
    //studySafeCall()
    //studyNonNull()
    //orElseGet()
    //orElseThrow()
    ifPresent()
}

fun studySafeCall(){
    name = "kyw"
    println(name?.length)
    println(kyw?.name)

    name = null
    kyw = null

    println(name?.length)
    println(kyw?.name)
}

// 절대 null 이 아님을 확신할 수 있는 상황에서만 사용
fun studyNonNull(){
    println(name!!.length)
}

// Optional.orElseGet
fun orElseGet(){
    println(name?.length ?: 0)
}

// Optional.orElseThrow
fun orElseThrow(){
    println(name?.length ?: throw NoSuchElementException())
}

// Optional.ifPresent
fun ifPresent(){
    name = "김예원"
    name?.let{ println(it)}
}
