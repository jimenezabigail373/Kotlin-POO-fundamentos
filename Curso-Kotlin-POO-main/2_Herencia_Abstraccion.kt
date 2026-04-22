abstract class Animal {
    abstract fun comunicarse()
    fun comer() = println("El animal está alimentándose.")
}

class Perro : Animal() {
    override fun comunicarse() = println("El perro ladra.")
}

class Pajaro : Animal() {
    override fun comunicarse() = println("El pájaro trina.")
}

fun main() {
    val miPerro = Perro()
    miPerro.comunicarse()
    miPerro.comer()
}
