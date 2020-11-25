package day03_Object

/**
 * 洗衣机
 * 封装：private
 */
class T001_WashMachine (var module: String, var size: Int){
    var isDoorOpen = true;
   fun openDoor(){
       isDoorOpen = true;
       println("打开门")
   }
    fun closeDoor(){
        isDoorOpen = false;
        println("关上门")
    }

    fun start(){
        if(isDoorOpen){
            println("请先关上门...")
        }else{
            println("注水..")
            println("wash...")
        }
    }
    //封装
    private fun setMotor(){

    }
}