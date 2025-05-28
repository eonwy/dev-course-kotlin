package h_collection

fun main() {
    // list
    val list = listOf(1, 2, 3, 4, 5)
    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)

    mutableList.addLast(0)
    println(list)
    println(mutableList)

    // set
    val set = setOf(6, 7, 8, 9, 10)
    val mutableSet = mutableSetOf(6, 7, 8, 9, 10)

    println(set)
    println(mutableSet)

    // map
    val map = mapOf(Pair("name", "kyw"), Pair("age", "100"))
    println(map)
    val ageMap = mapOf("kyw" to 25, "kkk" to 10)
    println(ageMap)
    println(map["name"])
}