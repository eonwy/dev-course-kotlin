package h_collection

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class B_extensionKtTest{

    @Test
    fun testFilter() {
        val numbers = listOf(1, 2, 3, 4, null, 8, 9, null)

        println("null 제거 : ${numbers.filterNotNull()}")
        println("짝수만 출력 : ${numbers.filterNotNull().filter { it % 2 == 0 }}")
        println("홀수만 출력 : ${numbers.filterNotNull().filterNot { it % 2 == 0 }}")
    }

    @Test
    fun testMap() {
        val names = listOf("전지현", null, "오드리햅번", "김태리")
        val listOfList = listOf(listOf(1, 2, 3, 4), listOf(3, 5, 6))

        println("null 이 아닌 문자열의 길이 : ${names.mapNotNull { it?.length }}")
        println("flat map : ${listOfList.flatten()}")
    }

    @Test
    fun testSort() {
        val numbers = listOf(2, 7, 4, 1, 8, 3)
        data class Coffee(val name: String, val price: Int)
        val coffees = listOf(
            Coffee("아메리카노", 1000), Coffee("아이스모카", 3000), Coffee("라떼", 2000)
        )

        println("오름차순 정렬 : ${numbers.sorted()}")
        println("내림차순 정렬 : ${numbers.sortedDescending()}")
        println("이름 순으로 정렬 : ${coffees.sortedBy { it.name }}")
        println("가격 순으로 정렬 : ${coffees.sortedByDescending { it.price }}")
        println("이름 순으로 오름차순 정렬, 가격으로 내림차순 정렬 : ${coffees.sortedWith{a, b ->
            if(a.name == b.name) {
                return@sortedWith b.price.compareTo(a.price)
            }
            a.name.compareTo(b.name)
        }}")
    }

    @Test
    fun testGroupBy() {
        data class Student(val name: String, val gender: String, val grade: String)
        val students = listOf(
            Student("정성찬", "M","A"), Student("쇼타로", "M","B"), Student("박원빈", "M","B"), Student("김예원", "FM","A")
        )

        println("이름-등급 : ${students.associate { it.name to it.grade }}")
        println("등급-학생 : ${students.groupBy { it.grade }}")
        println("이름-등급 : ${students.map { it.name }.associateWith { it.length }}")
    }
}