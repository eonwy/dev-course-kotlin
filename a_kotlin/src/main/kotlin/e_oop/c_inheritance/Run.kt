package e_oop.c_inheritance

fun main(){
    val rectangle = Rectangle(10.0, 20.0)
    println(rectangle.calArea())

    val fourSquare = FourSquare(1000.0)
    println(fourSquare.calArea())
}