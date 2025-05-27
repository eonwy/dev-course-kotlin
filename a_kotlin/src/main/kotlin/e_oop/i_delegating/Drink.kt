package e_oop.i_delegating

interface Drink {
    fun getPrice():Int
    fun getDesc():String
    fun addStock(cnt:Int)
    fun deductStock(cnt:Int)
}