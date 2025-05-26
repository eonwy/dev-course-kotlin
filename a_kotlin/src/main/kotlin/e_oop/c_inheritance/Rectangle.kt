package e_oop.c_inheritance

open class Rectangle(
    val width: Double,
    val height: Double
) : Figure(){
    override fun calArea(): Double {
        return width * height
    }
}