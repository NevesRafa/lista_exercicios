package lista_3

fun main() {
    TestaRecursao().mostraNum(0)
}


class TestaRecursao {

    fun mostraNum(numero: Int) {
        println(numero)

        if (numero == 50) {
            return
        }

        mostraNum(numero + 1)
    }
}