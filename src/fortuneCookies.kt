fun main(){
    //getFortuneCookie()
    println("\nYour fortune is: ${getFortuneCookie()}")

    var fortune:String = "5"
    for (i in 1..7){
        println("\nYour fortune is: $fortune")
        if(fortune.contains("Take it easy")) break
    }
}
fun getFortuneCookie():String {
    val fortune = listOf("You will have a great day!", "Things will go well for you today.",
    "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.")

    print("\nEnter your birthday")
    val birthday =  readLine()?.toIntOrNull()?:1
    /*val birthday: String? = readLine()
    birthday?.toIntOrNull()?:println("Digite o dia do seu aniversário")
    //birthday ?:println("Digite o dia do seu aniversário")
    */
    return fortune[birthday.rem(fortune.size)]
    /*
    val index = birthday % 7

    for ((index, value) in fortune.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }*/


}

