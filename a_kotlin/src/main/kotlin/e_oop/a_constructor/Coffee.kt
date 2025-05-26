package e_oop.a_constructor

// 코틀린의 클래스는 final class
// 주 생성자 : 클래스 이름 뒤 선언
// getter / setter 자동 생성
// val : getter 만 자동생성
// var : getter/setter 모두 생성
class Coffee(
    // 매개변수
    name: String,
    price: Int,
    // 클래스 속성 선언
    var stock : Int = 0,
    var totalSalesCnt: Int = 0
) {
    val name: String
    val price: Int

    // 주 새성자 초기화 블록
    init{
        println("주 생성자 호출")
        println("name : $name")
        println("price : $price")
        this.name = "$name 님"
        this.price = price * 100
    }

    // 부생성자
    constructor(name:String) : this(name, 0){
        println("부생성자 호출")
    }

    override fun toString(): String {
        return "Coffee(name='$name', price=$price, stock=$stock, totalSalesCnt=$totalSalesCnt)"
    }
}

fun main(){
    // val americano = Coffee("아메리카노", 1000, 0,  100 )
    // val americano = Coffee("아메리카노", 1000)
    // val americano = Coffee("아메리카노", 1000, 10)
    //val americano = Coffee("아메리카노", 1000, totalSalesCnt = 100 )
    val americano = Coffee("아메리카노")
    println(americano)
}

