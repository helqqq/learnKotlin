package day03
//变量的取值范围 Byte Short Int Long Fload Double String
fun main(args: Array<String>) {
    val aByte:Byte = Byte.MAX_VALUE
    var bByte:Byte = Byte.MIN_VALUE
    println("max_byte:" + aByte)
    println("min_byte:" + bByte)

    val aLong:Long = Long.MAX_VALUE
    var bLong:Long = Long.MIN_VALUE
    println("max_long:" + aLong)
    println("min_long:" + bLong)
    //二进制方式赋值
    val aInt:Int = 0b0011
    println("aInt:" + aInt)

}
