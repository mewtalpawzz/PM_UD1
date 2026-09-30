package practicas

data class Producto (
    val nombre : String,
    val codigo : String
)

class Inventario {

private val productos: MutableSet<Producto> = mutableSetOf()

fun agregarProducto(pr : Producto){
        val agregado = productos.add(pr)
        if(agregado){
            println("Producto ${pr.nombre} agregado correctamente")
        } else {
            println("Producto ${pr.nombre} ya existe")
        }
    }

    fun mostrarProductos (pr: Producto) {
        if (productos.isEmpty()) {
            println("El inventario está vacío")
        } else {
            for ((nombre, codigo) in productos){
                println(" - $nombre ($codigo)")
            }
        }
    }
}

