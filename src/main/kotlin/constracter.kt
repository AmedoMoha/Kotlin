import kotlin.system.measureNanoTime

class Students(val name:String, var gender:String, val age:Int){

}

fun main(args:Array<String>) {
//    this is an object
    val myobj=Students("Ahmed","Male",19)
    val myobj2=Students("Hawaa","Female",18)
    val myobj3=Students("Mariam","Female",20)
    val myobj4=Students("Mohammed","Male",60)
    val myobj5=Students("Mwanakombo","Female",51)
    println("Student name is ${myobj.name} and he is a ${myobj.gender} of ${myobj.age} years old")
    println("Student name is ${myobj2.name} and he is a ${myobj2.gender} of ${myobj2.age} years old")
    println("Student name is ${myobj3.name} and he is a ${myobj3.gender} of ${myobj3.age} years old")
    println("Parent name is ${myobj4.name} and he is a ${myobj4.gender} of ${myobj4.age} years old")
    println("Parent name is ${myobj5.name} and he is a ${myobj5.gender} of ${myobj5.age} years old")


}