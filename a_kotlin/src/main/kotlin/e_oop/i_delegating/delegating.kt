package e_oop.i_delegating

sealed class Topping(val name: String, val price: Int){
    data object Milk:Topping("Milk", 300)
    data object JavaChip:Topping("JavaChip", 500)
    data object Whipping:Topping("Whipping", 1000)
}

// Drink by coffee 
// 직접 override 하지 않는 Drink 인터페이스의 메서드는 coffee 에게 위임
class CustomCoffee(val coffee: Drink, val topping:Topping): Drink by coffee{
    override fun getPrice(): Int {
        return coffee.getPrice() + topping.price
    }

    override fun getDesc(): String {
        return "${coffee.getDesc()}, ${topping.name}"
    }
}

fun main(){
    var coffee: Drink = Coffee(1000, "아메리카노", 10)
    coffee = CustomCoffee(coffee, Topping.JavaChip)
    coffee = CustomCoffee(coffee, Topping.Milk)
    coffee = CustomCoffee(coffee, Topping.Whipping)
    println("결제금액 : ${coffee.getPrice()}, ${coffee.getDesc()}")
}