package practicas

fun main(){
    println("Bienvenido")
    println("¿Cual es su nombre?")
    val personaNombre = readLine()

    println("¿Y su edad?")
    val edadInput = readLine() ?: "0"
    val edad = edadInput.toInt()

    val edadFutura = edad + 5

    println("Su nombre es $personaNombre y su edad dentro de 5 años sera $edad") // Quiero comer
}