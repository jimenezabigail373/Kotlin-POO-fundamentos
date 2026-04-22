fun main() {
    val lista: List<Animal> = listOf(Perro(), Pajaro())

    for (a in lista) {
        a.comunicarse()
        
        // Smart Cast
        if (a is Perro) {
            println("-> Acción especial: El perro corre.")
        } else if (a is Pajaro) {
            println("-> Acción especial: El pájaro vuela.")
        }
    }
}
// Nota: Usa las clases del archivo 2
