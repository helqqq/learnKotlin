package day03_Extend

/**
 * 小头爸爸
 * 代理和委托 by
 */
class T001_SmallHeadFathor:T001_IWashBowl by T001_BigHeadSon {

    override fun washing() {
        println("小头爸爸洗碗，一次赚10元")
        T001_BigHeadSon.washing()
        println("我是看着儿子把碗洗完了")
    }

}