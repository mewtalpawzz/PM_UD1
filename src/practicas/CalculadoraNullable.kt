package practicas

class CalculadoraNullable {
    // Suma
    fun sumar(a: Int?, b: Int?): Int {
        return (a ?: 0) + (b ?: 0)
    }
    //Resta
    fun restar(a: Int?, b: Int?): Int {
        return (a ?: 0) - (b ?: 0)
    }
    //Multiplicar
    fun multiplicar(a: Int?, b: Int?): Int {
        return (a ?: 0) * (b ?: 0)
    }
    //División
    /*fun dividir(a: Int, b: Int): Int {
        return a / b
    }*/

    fun dividir(a: Int?, b: Int?): Double {
        val divisor = b ?: 0
        if (b == 0) throw IllegalArgumentException("No se puede dividir por cero")
        return (a ?: 0).toDouble() / divisor.toDouble()
    }
}