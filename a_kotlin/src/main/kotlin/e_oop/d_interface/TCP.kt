package e_oop.d_interface

interface TCP {
    fun connect(ip: String){
        println("$ip 연결 중...")
    }
}