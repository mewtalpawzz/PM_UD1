package practicas

class Libro (val titulo: String, val autor: String,val anioPublicacion: Int){
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}

fun main() {
    val libro = Libro("Kimi ni Todoke 1", "Karuho Shiina", 2005)
    val (titulo, autor, anio) = libro
    println("El libro $titulo del autor $autor fue publicado en el año $anio")
}