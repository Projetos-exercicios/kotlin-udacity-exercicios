import java.time.DayOfWeek
import java.util.*

fun main(){
    dayOfWeek()

}
fun dayOfWeek(){
    println("What day is it today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(when(day){
        1-> "Domingo"
        2-> "Segunda"
        3-> "Terça"
        4-> "Quarta"
        5-> "Quinta"
        6-> "Sexta"
        7-> "Sábado"
        else ->"Time has stopped"
    })


    /*when(day){
        1-> println("Domingo")
        2-> println("Segunda")
        3-> println("Terça")
        4-> println("Quarta")
        5-> println("Quinta")
        6-> println("Sexta")
        7-> println("Sábado")
        else ->println("Time has stopped")
    }*/


}