fun main(args: Array<String>){
    val obj = Student ("Ahmed Mohammed", 19,"Mariakani boys high school")
}

class Student{
    constructor(name: String, age: Int,school:String){
        println("Student Name is ${name.toUpperCase()}")
        println("Student Age is $age")
        println("Student School is $school")
    }
}