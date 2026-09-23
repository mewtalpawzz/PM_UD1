package practicas

fun main (){
    val numEnt : Int

    println("Dime un numero entero")
    numEnt = readln().toInt()


    for (i in 1..numEnt){
        println("Numero: $i")
        if (i % 3 == 0){
            continue
        }
        if(i == 20){
            break
        }
        println(i)
    }
}