package practicas

class CalculadoraCuerpoExpresion {
    // Suma
    fun sumar(a: Int?, b: Int?): Int = (a ?: 0) + (b ?: 0)

    //Resta
    fun restar(a: Int?, b: Int?): Int = (a ?: 0) - (b ?: 0)

    //Multiplicar
    fun multiplicar(a: Int?, b: Int?): Int = (a ?: 0) * (b ?: 0)

    //División
    /*fun dividir(a: Int, b: Int): Int {
        return a / b
    }*/

    fun dividir(a: Int?, b: Int?): Double =
        if (b == null || b == 0) throw IllegalArgumentException("No se puede dividir por cero o null")
        else (a ?: 0).toDouble() / b.toDouble()

    fun saludo (nombre : String?, tratamiento : String? = "Doña") : String = "Buenos días $tratamiento $nombre"
}