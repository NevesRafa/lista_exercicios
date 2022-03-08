package corrigir_codigo

fun main() {
    batalhaPokemon(10, 8)
    batalhaPokemon(8, 10)
    batalhaPokemon(8, 8)
}

// acrescentado else if para empate!
fun batalhaPokemon(atributoP1: Int, atributoP2: Int) {
    if (atributoP1 > atributoP2) {
        println("Vitória do pokemon 1")
    } else if (atributoP1 == atributoP2) {
        println("Empate!")
    } else {
        println("Vitória do pokemon 2")
    }
}