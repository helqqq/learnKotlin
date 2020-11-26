package day03_Extend

fun main(args: Array<String>) {
    var s1:T003_Son = T003_Son.小小驴()
    var s2:T003_Son = T003_Son.小骡子()
    var s3:T003_Son = T003_Son.小骡子()
    var list = listOf<T003_Son>(s1,s2,s3)

    for(son in list){
        if(son is T003_Son.小骡子){
            son.sayHello()
        }
    }

}