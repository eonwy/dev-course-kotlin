package i_io

import java.io.File

private val fileName = "test.txt"
private val directory = "file"

fun main(){
    //createDirectory()
    //createFile()
    fileInfo()
}

private fun createDirectory(){
    val dir = File(directory)
    if(!dir.exists()){
        dir.mkdirs()
    }
}

private fun createFile(){
    val file = File("$directory/$fileName")
    // use : try - with - resources 역할을 수행
    file.bufferedWriter().use{it.write("IO 테스트 입니다.")}
}

private fun fileInfo(){
    val file = File("$directory/$fileName")
    println("이름 : ${file.name}")
    println("경로 : ${file.absolutePath}")
    println("존재 여부 : ${file.exists()}")
    println("파일 여부 : ${file.isFile}")
    println("디렉토리 여부 : ${file.isDirectory}")
}

