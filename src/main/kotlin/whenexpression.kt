fun main(args: Array<String>) {
    println("Enter Letter: ")

    var mychar= readln()
    when (mychar){
        "A","a"-> println("A is a vowel")
        "E","e"-> println("E is a vowel")
        "I","i"-> println("I is a vowel")
        "O","o"-> println("O is a vowel")
        "U","u"-> println("U is a vowel")

        else -> println("$mychar is a Consonant")
    }

}