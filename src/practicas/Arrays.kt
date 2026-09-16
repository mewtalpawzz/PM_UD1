package practicas

fun main (){
    val income = arrayOf<Double>(
        0.5, 2.5, 4.0, 5.0,
        4.5, 6.0, 7.6, 8.0,
        5.0, 6.4, 4.0, 9.1
    )

    var tags = emptyArray<String>()
    println("Tamaño inicial: ${tags.size}")

    tags = arrayOf("kotlin", "android", "dam")
    println("Tamaño tras asignar: ${tags.size}")

    val colors = arrayOfNulls<String>(3)
    println(colors.contentToString())

    colors[0] = "Rojo"
    colors[1] = "Verde"
    colors[2] = "Azul"
    println(colors.contentToString())

    val negativeNumbers = Array(10) { -(it + 1) }
    //Sin corchetes
    println(negativeNumbers.joinToString())
    //Con corchetes
    println(negativeNumbers.contentToString())

    val notas = DoubleArray(5)                // [0.0, 0.0, 0.0, 0.0, 0.0]
    val cuadrados = IntArray(5) { it * it }    // [0, 1, 4, 9, 16]

    val planets = arrayOfNulls<String>(8)
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"
    println(planets.contentToString())

    for (i in planets.indices) {
        println("${planets[i]} está en la posición ${i + 1}")
    }

    for (i in 0 until planets.size) {
        println("${planets[i]} está en la posición ${i + 1}")
    }

    planets.forEachIndexed { i, v ->
        println("$v está en la posición ${i + 1}")
    }
    //Vamos tu puede
}