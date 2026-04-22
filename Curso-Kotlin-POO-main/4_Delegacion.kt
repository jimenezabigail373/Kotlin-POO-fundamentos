interface Acciones {
    fun encender()
}

class SistemaElectronico : Acciones {
    override fun encender() = println("Sistema iniciado correctamente.")
}

// Delegamos la acción al objeto 'a'
class Computadora(a: Acciones) : Acciones by a

fun main() {
    val core = SistemaElectronico()
    val pc = Computadora(core)
    pc.encender()
}
