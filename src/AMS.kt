import java.util.*

fun main(){
    feedTheFish()
}
fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Hoje é $day e o peixe comeu $food")
}
fun randomDay():String{
  val week = listOf("Domingo", "Segunda","Terça","Quarta","Quinta","Sexta","Sábado")
  return week[Random().nextInt(7)]
  //return week(Random().nextInt(7))
}