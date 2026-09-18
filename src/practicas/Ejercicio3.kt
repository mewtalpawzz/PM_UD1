package practicas

fun main(){
    val notas = DoubleArray(5)

    for (i in 0 until notas.size){
        println("Digame el ${i+1} numero")
        val entrada = readln()
        val nota = entrada.toDoubleOrNull() ?: 0.0
        notas[i] = nota
    }
    // 6.75, 8.40, 9.25, 6.05, 7.30, SUPONGO
    var suma = 0.0

    for (i in notas){
        suma += i
    }

    val promedio = suma/notas.size

    var notaMax = 0.0

    for (i in notas){
        if (i > notaMax){
            notaMax = i
        }
    }

    println("""
        Las notas introducidas son ${notas.joinToString(", ")} 
        La suma es: $suma  
        El promedio de todas las notas es $promedio 
        La nota más alta $notaMax
    """.trimIndent())
}