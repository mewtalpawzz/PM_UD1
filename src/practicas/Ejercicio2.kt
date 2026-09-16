package practicas

fun main(){
    println("Dime un nombre de un idol")
    val nombreIdol = readln()

    println("Dime un numero entero, el que tu quieras")
    val numEntero = readln().toInt()

    val longitud = nombreIdol.length

    if(numEntero < 0 || numEntero > nombreIdol.length){
        println("Error: La posición \$posicion está fuera de los límites de la cadena.")
        println("La cadena solo tiene \$longitud caracteres (posiciones 0 a \${longitud - 1}).")
    } else {
        val caracterActual = nombreIdol[numEntero]
        println("Carácter en la posición $numEntero: '$caracterActual'")

        if (numEntero > 0) {
            val caracterAnterior = nombreIdol[numEntero - 1]
            println("Carácter anterior: '$caracterAnterior'")
        } else {
            println("Carácter anterior: No existe (es la primera posición)")
        }

        if (numEntero < longitud - 1) {
            val caracterSiguiente = nombreIdol[numEntero + 1]
            println("Carácter siguiente: '$caracterSiguiente'")
        } else {
            println("Carácter siguiente: No existe (es la última posición)")
        }
    }
}
