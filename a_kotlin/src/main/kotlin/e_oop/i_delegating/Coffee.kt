package e_oop.i_delegating

class Coffee(
    private val price: Int,
    private val name: String,
    private var stock: Int
): Drink {
    override fun getPrice(): Int {
        return this.price
    }

    override fun getDesc(): String {
        return this.toString()
    }

    override fun addStock(cnt: Int) {
        this.stock += cnt
    }

    override fun deductStock(cnt: Int) {
        this.stock -= cnt
    }

    override fun toString(): String {
        return "Coffee(price=$price, name='$name', stock=$stock)"
    }


}