open class Wazazi {
    val mama="She likes Cooking"
    val baba="He likes watching Manchester United"
}
class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }
}
class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }
}

fun main(args: Array<String>) {
    val kjobj=boy()
    kjobj.mvulana()
    val kjobj2=girl()
    kjobj2.msichana()
}