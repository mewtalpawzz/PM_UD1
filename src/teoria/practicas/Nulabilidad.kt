package teoria.practicas

fun main() {
    /*var noAceptaNull: String
    noAceptaNull = null  // Error*/

    var aceptaNull: String?
    aceptaNull = null   // OK

    // Inferencia
    var cardName = "Animal compañero" // :String
    // Sucesos...
    //cardName = null // Error

    fun showBeastsList(beasts: List<String>?) {
        if (beasts != null && beasts.isNotEmpty()) {
            beasts.forEach { println(it) }
        }
    }
}