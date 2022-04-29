package lista_3

fun main() {
    Fibonacci().fibonacci(1, 1, 2000)
}

class Fibonacci {

    fun fibonacci(penultimo: Int, ultimo: Int, terminaEm: Int) {

        val soma = penultimo + ultimo

        if (soma >= terminaEm) {
            return
        }

        println(soma)
        fibonacci(ultimo, soma, terminaEm)
    }

}