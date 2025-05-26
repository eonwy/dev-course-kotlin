package d_function

// public, internal, private

// public
// default 접근제한자, 어디에서든 접근이 가능
fun publicFnc(){
    println("public")
}

// internal
// 함께 컴파일 되는 단위 안에서 접근이 가능
// 외부 모듈에서는 접근이 불가
internal fun internalFnc(){
    println("internal")
}

// private
// 코틀린 소스파일 안에서만 접근이 가능
private fun privateFnc(){
    println("private")
}