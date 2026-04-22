interface InterfaceA {
    fun imprimir() = println("Mensaje desde A")
}

interface InterfaceB : InterfaceD { // Herencia entre interfaces
    override fun imprimir() = println("Mensaje desde B")
}

interface InterfaceD {
    fun imprimir() = println("Mensaje desde D")
}

class ClaseC : InterfaceA, InterfaceB {
    override fun imprimir() {
        super<InterfaceA>.imprimir()
        super<InterfaceB>.imprimir()
    }
}

fun main() {
    val objeto = ClaseC()
    objeto.imprimir()
}
