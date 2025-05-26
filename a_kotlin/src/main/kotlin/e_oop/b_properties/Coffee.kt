package e_oop.b_properties

// 코틀린의 클래스는 final class
// 주 생성자 : 클래스 이름 뒤 선언
// getter / setter 자동 생성
// val : getter 만 자동생성
// var : getter/setter 모두 생성
// private : 생성하지 않음
class Coffee(
    // 매개변수
    name: String,
    val price: Int,
    var stock: Int = 0,
    // getter 는 열고 setter 는 닫지만 값을 수정하기 위한 함수는 필요
    private var _totalSalesCnt: Int = 0
) {
    // field : backing field 에 접근하기 위한 키워드
    var name:String? = null
        get() = "$field[커피]"
        set(value) {
            if(value.isNullOrBlank())
                throw IllegalArgumentException()
            field = value
        }

    val totalSalesCnt: Int
        get() = this._totalSalesCnt

    val addTotalSalesCnt = {cnt: Int ->
        this._totalSalesCnt += cnt
    }

    init {
        this.name = name
    }

    override fun toString(): String {
        return "Coffee(name='$name', price=$price, stock=$stock, totalSalesCnt=$totalSalesCnt)"
    }
}

fun main(){
    val americano = Coffee("아메리카노", 1000, 0,  100 )
    println(americano.name)
    americano.name = "americano"
    println(americano.name)
    americano.addTotalSalesCnt(10)

}

