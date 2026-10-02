package practicas

data class Task(val title: String, val completed: Boolean = false)

fun filterTasks(tasks: List<Task>, criterio: (Task) -> Boolean): List<Task> {
    // TODO: implementar usando filter
    return tasks.filter(criterio)
}

// 3. Función de extensión para mostrar tareas
fun List<Task>.printTasks() {
    // TODO: recorrer la lista y mostrar cada tarea con [x] o [ ]
        if (this.isEmpty()){
            println("No hay tareas para mostrar")
        } else {
            for (task in this) {
                val status = if(task.completed) "[x]" else "[ ]"
                println("$status %{task.title}")
            }
        }
}


// 4. Función infix para comparar títulos de tareas
infix fun Task.sameTitleAs(other: Task): Boolean {
    // TODO: comparar this.title con other.title
    return this.title == other.title
}

fun main(){
        val tasks = listOf(
        Task("Comprar pan"),
        Task("Estudiar lambdas"),
        Task("Practicar infix"),
        Task("Estudiar funciones de extensión", completed = true),
        Task("Ver Kotlin en YouTube", completed = true)
}