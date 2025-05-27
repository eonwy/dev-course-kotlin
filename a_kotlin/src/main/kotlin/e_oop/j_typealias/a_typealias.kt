package e_oop.j_typealias

// 타입에 별칭을 부여
typealias UserId = String
typealias ProductId = Long
typealias Price = Int
typealias Items = List<ProductId>

data class Order(
    val orderId: Long,
    val userId: UserId,
    val productId: ProductId,
    val items: Items,
    val totalPrice: Price
)

fun main(){
    val order = Order(
        orderId = 12345L,
        userId = "test",
        productId = 2222L,
        items = listOf(1,2,3),
        totalPrice = 50000)
    println(order)
}

