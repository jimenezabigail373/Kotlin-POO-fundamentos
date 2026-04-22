// 1. Definición de la estructura base
abstract class Animal {
    abstract fun comunicarse()
    fun comer() = println("El animal está comiendo.")
}

// 2. Interfaces con habilidades y lógica de impresión
interface Habilidad {
    fun accionEspecial()
}

// 3. Clases concretas con Herencia e Interfaces
class Perro(val nombre: String) : Animal(), Habilidad {
    override fun comunicarse() = println("$nombre dice: ¡Guau!")
    override fun accionEspecial() = println("$nombre está corriendo a por la pelota.")
}

class Pajaro(val nombre: String) : Animal(), Habilidad {
    override fun comunicarse() = println("$nombre dice: ¡Pío pío!")
    override fun accionEspecial() = println("$nombre está volando por el cielo.")
}

// 4. Clase Maestra que gestiona el sistema (Uso de Polimorfismo)
class Refugio {
    private val listaAnimales = mutableListOf<Animal>()

    fun adoptar(animal: Animal) {
        listaAnimales.add(animal)
        println("Nuevo animal en el refugio.")
    }

    fun realizarCuidadoGeneral() {
        println("\n--- Iniciando Cuidado General ---")
        for (animal in listaAnimales) {
            animal.comunicarse() // Polimorfismo
            animal.comer()
            
            // Smart Cast para habilidades específicas
            if (animal is Habilidad) {
                animal.accionEspecial()
            }
        }
    }
}

fun main() {
    val miRefugio = Refugio()
    
    // Agregando diferentes tipos (Polimorfismo en la entrada)
    miRefugio.adoptar(Perro("Fido"))
    miRefugio.adoptar(Pajaro("Tweety"))
    
    // Ejecutar toda la lógica del curso
    miRefugio.realizarCuidadoGeneral()
}
