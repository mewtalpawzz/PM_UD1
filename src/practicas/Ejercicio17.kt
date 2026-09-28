package practicas

data class Usuario (
    val nombre: String,
    val edad: Int,
    val email: String
)

fun main(){
    val usuario = Usuario("Ana", 25, "ana@gmail.com")
    val (nombre, edad, _) = usuario
    println("Usuario: $nombre tiene $edad años")
}