class Persona(val documento: String, var nombre: String) {
    var edad: Int = 0
        set(valor) {
            if (valor >= 0) field = valor else println("Error: Edad negativa")
        }

    fun mostrar() = println("Perfil: $nombre | Doc: $documento | Edad: $edad")
}

fun main() {
    val p = Persona("888", "Cristian")
    p.edad = 30
    p.mostrar()
}
