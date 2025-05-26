package e_oop.d_interface

class SmartPhone: HTTPS, SMTP {
    override fun request() {
        println("HTTPS Request")
    }

    override fun response() {
        println("HTTP Response")
    }

    override fun process() {
        super<HTTPS>.process()
        super<SMTP>.process()
    }

    override fun encrypt() {
        println("암호화")
    }
}