package e_oop.d_interface

fun main(){
    val phone = SmartPhone()
    phone.request()
    phone.response()
    phone.encrypt()
    phone.connect("0.0.0.1")
    phone.process()
}