package e_oop.i_delegating

abstract class CoffeeDecorator(val decorated: Drink): Drink{
    override fun getPrice(): Int {
        return decorated.getPrice()
    }

    override fun getDesc(): String {
        return decorated.getDesc()
    }
}

class JavaChip(val target: Drink): CoffeeDecorator(target){

    override fun getPrice(): Int {
        return target.getPrice() + 500
    }

    override fun getDesc(): String {
        return target.getDesc() + ", JavaChip"
    }

    override fun addStock(cnt: Int) {
        target.addStock(cnt)
    }

    override fun deductStock(cnt: Int) {
        target.deductStock(cnt)
    }
}

class Whipping(val target: Drink): CoffeeDecorator(target){

    override fun getPrice(): Int {
        return target.getPrice() + 1000
    }

    override fun getDesc(): String {
        return target.getDesc() + ", Whipping"
    }

    override fun addStock(cnt: Int) {
        target.addStock(cnt)
    }

    override fun deductStock(cnt: Int) {
        target.deductStock(cnt)
    }
}

class Milk(val target: Drink): CoffeeDecorator(target){

    override fun getPrice(): Int {
        return target.getPrice() + 300
    }

    override fun getDesc(): String {
        return target.getDesc() + ", Milk"
    }

    override fun addStock(cnt: Int) {
        target.addStock(cnt)
    }

    override fun deductStock(cnt: Int) {
        target.deductStock(cnt)
    }
}

fun main(){
    var coffee: Drink = Coffee(1000, "아메리카노", 10)
    coffee = JavaChip(coffee)
    coffee = Milk(coffee)
    coffee = Whipping(coffee)
    println("결제금액 : ${coffee.getPrice()}, ${coffee.getDesc()}")
}