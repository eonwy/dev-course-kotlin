package c_control

fun main(){
    var grade: Char? = null
    print("score : ")
    val score = readln().toInt()

    if(score > 90){
        grade = 'A'
    }else if(score > 80){
        grade = 'B'
    }else{
        grade = 'F'
    }

    println(grade)

    // 조건문 표현식
    // 코드블록의 마지막 라인에 작성된 표현식의 값을 반환
    val result = if(grade == 'A') "scholarship" else if(grade == 'F') "Fail" else "Pass"
    println(result)

}