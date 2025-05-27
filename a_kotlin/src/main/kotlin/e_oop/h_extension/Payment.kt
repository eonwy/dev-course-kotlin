package e_oop.h_extension

class Payment(
    val coffee:String,
    val orderCnt:Int,
    val payPrice:Int
) {
    fun orderName(): String {
        return "$coffee, [$orderCnt 잔] $payPrice 원"
    }
}

fun main() {
    val payment = Payment("아메리카노", 3, 9000)
    println(payment.orderName())
}