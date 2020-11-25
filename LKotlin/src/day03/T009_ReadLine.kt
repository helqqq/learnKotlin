package day03

import java.math.BigInteger

fun main(args: Array<String>) {
    //人机交互
//    read()
    //递归
    println("5! = " + fact(5))
    //斐波那契数列
    println("fb(5) = " + fb(5))
    //尾递归
    var result = 0;
    println("result : " + ollAdd(5,result))
}
//人机交互 & 异常捕获
fun read(){
    println("请输入第一个数字：")
    var numStr1 = readLine()//默认输入可为null的String
    println("请输入第一个数字：")
    var numStr2 = readLine()
    try {
        var num1 = numStr1!!.toInt() //不为null时转为int
        var num2 = numStr2!!.toInt()
        println("${num1} + ${num2} = ${num1 + num2}")
    }catch (e:Exception){
        println("输入的数字有异常，请重新输入！！")
    }
}
//递归查阶乘 n * (n-1) *... 4 * 3 * 2 * 1
fun fact(num: Int): Int{
    if(num == 1){
        return num;
    }
    return num * fact(num - 1)
}
//int数字太大则用BigInteger
fun fact2(num: BigInteger):BigInteger{
    if(num == BigInteger.ONE){
        return num;
    }
    return num * fact2(num - BigInteger.ONE)
}
//尾递归优化 累加操作 5+4+3+2+1
tailrec fun ollAdd(num: Int,result: Int):Int{
    if(num == 0){
        return result
    }else{
        return ollAdd(num - 1,result + num)
    }
}
//斐波那契数列 1 2 3 5 8 13 21
//           1 2 3 4 5 6  7
fun fb(num : Int):Int{
    if(num == 1 || num == 2){
        return num
    }
    return fb(num - 1) + fb(num - 2)
}


