package day03_Extend

/**
 * 枚举类：更在意数据
 */
enum class T002_Week {
    Sunday,Monday,Tuesday,Thursday
}

fun main(args: Array<String>) {
    println(T002_Week.Monday)
    println(T002_Week.Monday.ordinal)//0
}