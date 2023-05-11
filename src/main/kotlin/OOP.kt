class Bereri {
//    datamember
    private var num:Int = 7
// menber function
    fun calculate():Int {
        return num * num

    }
}

fun main(args: Array<String>) {
//    THIS IS AN OBJECT
    val myobject=Bereri()
    println(myobject.calculate())

}
