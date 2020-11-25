package day03_Object

/**
 * 多态
 */
fun main(args: Array<String>) {
    var boy = T003_Man("天天")
    var girl = T003_Woman("小可爱")
    var pers = listOf<T003_Human>(boy,girl)
    for(per in pers){
        if(per is T003_Man){
            per.eat()
        }
        per.pee()
    }
}