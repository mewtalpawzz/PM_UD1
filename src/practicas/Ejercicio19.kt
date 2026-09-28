package practicas

class Novela(val titulo: String, val autor: String, val anioPublicacion: Int){
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}

fun main(){
    val biblioteca = listOf(Novela("Kimi Ni Todoke", "Karuho Shiina", 2005), Novela("Yamada-kun to lvl999", "Mashiro", 2019),
        Novela("Ouran High School Host Club", "Bisco Hatori", 2006))

    for ((titulo, autor, anio) in biblioteca){
        println("La novela $titulo del autor $autor fue pulicada en el año $anio")
    }

    biblioteca.forEach { (titulo, _, anio)  ->
        println("La novela $titulo fue publicada en el año $anio")
    }

}
