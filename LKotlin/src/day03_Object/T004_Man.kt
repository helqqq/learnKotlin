package day03_Object

class T004_Man(name:String):T004_IMan,T003_Human(name){
    override fun play() {
        println("加油，你是最棒的")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun pee() {
        TODO("Not yet implemented")
    }

}