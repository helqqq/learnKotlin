package day03

val pi = 3.14159f
//函数和函数表达式
fun main(args: Array<String>) {
    println(add(10,20))
    //函数表达式
    var sub = {x: Int,y :Int -> x - y}
    var res =sub(20,3)
    println(res)
    //函数式声明
    var muti:(Int, Int) -> Int = {x,y -> x * y}
    var res2 = muti(2,3)
    println(res2)

    println("圆的周长:" + getRectangle(r = 2.0f))
}
fun add(x: Int, y: Int):Int = x + y
//具名参数和默认参数
//长方形面积
fun getReactArea(length:Float,width:Float):Float = length * width
//圆的周长
fun getRectangle(PI:Float= pi, r:Float): Float = 2 * PI * r
//圆柱体体积 PI* R^2 * h
fun getTJ(PI: Float, r: Float, h: Float):Float = PI * r * r * h
//球的表面积 4 * PI * R * R
fun getArea(PI: Float,r: Float):Float = 4 * PI * r * r



