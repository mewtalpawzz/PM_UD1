package practicas

fun main(){
    println("Dime un número entero")
    val a : Int = (readln()?: "0").toInt()
    println("Dime otro número entero")
    val b : Int = (readln()?: "0").toInt()

    val calculadora = Calculadora()
    println("El resultado de la suma es: ${calculadora.sumar(a,b)}")
    println("El resultado de la resta es: ${calculadora.restar(a,b)}")
    println("El resultado de la multiplicacion es: ${calculadora.multiplicar(a,b)}")
    //println("El resultado de la division es: ${calculadora.dividir(a,b)}")

    try {
        val resultado : Double = calculadora.dividir (a, b)
        println("divide $a / $b = ${"%.2f".format(resultado)}")   // Se formatea el valor double a 2 decimales
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}