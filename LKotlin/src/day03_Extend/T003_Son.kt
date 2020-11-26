package day03_Extend

/**
 * 印章类 sealed 子类类型有限  更在意类型
 */
sealed class T003_Son {
    class 小小驴():T003_Son()
    class 小骡子():T003_Son()
    fun sayHello(){
        println("hello ")
    }
}