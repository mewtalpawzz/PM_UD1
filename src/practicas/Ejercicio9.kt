package practicas

fun main(){
    val array1 = arrayOf(1, 2 , 3 , 4)
    val array2 = arrayOf(5, 6 , 7 ,8)

    bucleExterno@ for (num1 in array1) {
        println("Iteración de bucle externo: num1 = $num1")

        for (num2 in array2) {
            val suma = num1 + num2

            if (suma > 10) {
                println("Suma ($suma) > 10, saltando al siguiente num1...")
                continue@bucleExterno
            }


            println("  Pares válidos: ($num1, $num2), Suma = $suma")
        }
    }
}