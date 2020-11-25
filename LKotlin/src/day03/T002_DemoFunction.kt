package day03
/**
 * 函数
 */
fun main(args: Array<String>) {
    println(compare(3.0,2.0))
}
fun compare(a:Double,b:Double):Boolean{
    println(a > b)
    println(Math.sqrt(a) > Math.sqrt(b))
    return Math.pow(a,2.0) > Math.pow(b,3.0)
}