package day03
//基础知识
fun main(args: Array<String>) {
    println(diaryGenerater("景山公园"))
    compare()
    gradeStudent(4)
    arrays()
}
//字符串模板 ${}
fun diaryGenerater(placeName: String):String{
    var template = "今天天气晴朗，去${placeName}游玩，" +
            "首先映入眼帘的是 ${placeName} ${placeName.length}个鎏金大字"
    return template
}
//条件控制语句 if else
fun ConditionControl(a: Int, b: Int): Boolean{
    if(a > b) return true else return false
}
//字符串比较
fun compare(){
    var a: String = "Helena"
    var b: String = "helena"
    println(a == b)
    println(a.equals(b))
    println(a.equals(b,true))//忽略大小写的比较
}
//空值处理
//接收一个参数，参数是非空的String,加上?代表参数可以为空
fun heat(str: String){
}
fun test(){
//    heat(null) //编译器自动报错
}
//when测试
fun gradeStudent(score: Int){
    when(score){
        10 -> println("满分，棒棒哒")
        9 -> println("干的不错")//...
        6 -> println("刚刚好及格")
        else -> println("需要加油哦")
    }
}
//loop和Range: 数组的声明及用法
fun arrays(){
    var nums = 1 .. 10  //[1,10]
    for (n in nums){ // 1 2 3 4..
        print(n)
        print(" ")
    }
    var nums2 = 1 until 100 //[1,10)
    for(n in nums step 2){ // 1 3 5
        println(n)
    }
    var nums3 = nums2.reversed()//逆序
    nums3.count()//size()
}
