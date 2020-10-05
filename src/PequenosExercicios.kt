import java.util.*
import kotlin.math.pow

fun main(){
    println(2.plus(71).plus(233).minus(13).div(30).plus(1))

    println(listOf(null,null))

    var list: List<Int?> = listOf(null,null)
    var list2: List<Int>? = null

    var comida1 = "trout";
    var comida2 = "handdock"
    var comida3 = "snapper"

    println("Gosto de $comida1, provavelmente gosto de $comida2 e não tenho certeza se gosto de $comida3")

    var fishName =  "handdock"

    when(fishName.length){
        0->println("Erro")
        in 3..12 ->println("Good  fish name")
        else->println("ok fish name")
    }

    var fish = 12
    var plants = 5

    val swarm = listOf(fish, plants)
    val bigSwarm = arrayOf(swarm,arrayOf("dolphin","Whale", "orca"))

    println(Arrays.toString(bigSwarm))

//    val array = Array(5){it * 2}
//    println(Arrays.asList(bigSwarm))

    //val array = Array(7)
   //val array = {1000}

    val array = Array(7){1000.0.pow(it)}
    //val array = Array(7){1000.0.pow(it)}

    //Observe como tivemos que usar o valor duplo 1000.0, e não apenas 1000, para usarmos a função "pow".

    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte", "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }


    var list3 : MutableList<Int> = mutableListOf()

    for(i in 0..100 step 7)
    list3.add(i)
    print(list3)

    for(i in 0..100 step 7) println(i.toString() + " - ")


}