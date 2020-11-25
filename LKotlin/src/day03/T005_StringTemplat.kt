package day03
//字符串模板 ${}
fun main(args: Array<String>) {
    println(diaryGenerater("景山公园"))
}
fun diaryGenerater(placeName: String):String{
    var template = "今天天气晴朗，去${placeName}游玩，" +
            "首先映入眼帘的是 ${placeName} ${placeName.length}个鎏金大字"
    return template
}