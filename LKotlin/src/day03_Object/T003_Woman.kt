package day03_Object

/**
 * 多态：实现类
 */
class T003_Woman(name:String) : T003_Human(name) {
    override fun eat() {
        println("${name} 小口吃")
    }

    override fun pee() {
        println("${name} 蹲着")
    }
}