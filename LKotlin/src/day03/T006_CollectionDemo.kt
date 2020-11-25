package day03

import java.util.*

//集合
fun main(args: Array<String>) {
    testList()
    testMap()
}
//list
fun testList(){
    var lists = listOf("鸡蛋","米面","冰棍")
//    for(e in lists){
//        println(e)
//    }
    //增强
    for((i,e) in lists.withIndex()){
        println("$i $e")
    }
}
fun testMap(){
    var map = TreeMap<String,String>()
    map["name"] = "helena"
    map["age"] = "22";
    println(map["name"])

}