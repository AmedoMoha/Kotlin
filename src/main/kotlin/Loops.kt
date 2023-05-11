fun main(args: Array<String>) {
//    FOR LOOP

    for (i in 5..7) {
        println("loop : $i")
    }
    val myarr = arrayOf("ab", "cd", "ef",)

    for (n in myarr) {
        println(n)
    }

//WHILE LOOP
    var num = 10
    var num2 = 0
    var num3 = 106
    while (num >= 8){
        println("Loop : $num")
    num--
    }
    while (num2 <=3 ){
        println("Loop : $num2")
    num2++
    }

//DO..WHILE LOOP
    do{
        println("Loop : $num3")
        num3++
    } while (num3<=105)




}