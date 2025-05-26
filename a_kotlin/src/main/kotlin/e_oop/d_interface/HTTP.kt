package e_oop.d_interface

interface HTTP: TCP {
    fun request()
    fun response()
    fun process(){
        println("HTTP 통신 진행 중 입니다...")
    }
}