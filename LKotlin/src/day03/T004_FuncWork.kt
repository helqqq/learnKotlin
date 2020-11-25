package day03

//function 作业
fun main(args: Array<String>) {
    println(sayHello("张三"))
    println(checkAge(20))
}
fun sayHello(name: String):String{
    return "hello," + name
}
fun checkAge(age: Int): Boolean{
    if(age > 18) return true else return false
}
fun saveLog(logLevel: Int){

}