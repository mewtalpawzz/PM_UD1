package practicas

data class Usuario (
    val username : String,
    val email : String
)

class GestorUsuarios {
    private val usuarios: MutableList<Usuario> = mutableListOf()

    fun agregarUsuario (u : Usuario): Boolean{

        if (usuarios.any { it.email == u.email }) {
            println("El usuario ya existe")
            return false
        }
        usuarios.add(u)
        println("Usuario '\${usuario.username}' agregado correctamente")
        return true
    }

    fun mostrarUsuario (u: Usuario){
        if (usuarios.isEmpty()){
            println("No hay usuarios registrados")
        } else {
            println("Lista de usuarios registrados: ")
            usuarios.forEach { (username, email) -> println(" - ${username} (${email})") }
        }
    }

    fun buscarUsuarioPorEmail(email: String): Usuario? {
        val usuario = usuarios.find { it.email == email }
        return if (usuario != null) {
            println("Usuario encontrado: '\${u.username}' (${usuario.email})")
            usuario
        } else {
            println("No se encontró ningún usuario con el email '$email'.")
            null
        }
    }
}

fun main() {
    val gestor = GestorUsuarios()

    val u1 = Usuario("juan123", "juan@mail.com")
    val u2 = Usuario("ana89", "ana@mail.com")
    val u3 = Usuario("pepe77", "juan@mail.com") // mismo email que u1

    gestor.agregarUsuario(u1)
    gestor.agregarUsuario(u2)
    gestor.agregarUsuario(u3) // rechazado por duplicado

    gestor.mostrarUsuarios()

    gestor.buscarUsuarioPorEmail("ana@mail.com")
    gestor.buscarUsuarioPorEmail("noexiste@mail.com")
}

