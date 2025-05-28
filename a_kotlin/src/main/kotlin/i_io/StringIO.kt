package i_io

import java.io.File

private val fileName = "StringIO.txt"
private val directory = "file"

fun main(){
    //createFile()
    //readFile()
    readFileWithForeachLine()
}

private fun createFile(){
    println("\n 1. 파일 생성")
    File("$directory/$fileName")
        .bufferedWriter().use {
            it.write("Hello \n")
            it.append("Kotlin \n")
            it.append("IO")
        }
}

private fun readFile(){
    println("\n 2. 파일 읽기")
    File("$directory/$fileName")
        .bufferedReader().use { reader ->
            var line: String? = ""
            while(reader.readLine().also { line = it } != null){
                println(line)
            }
        }
}

private fun readFileWithForeachLine(){
    println("\n 3. 파일 읽기")
    File("$directory/$fileName")
        .forEachLine { println(it) }
}