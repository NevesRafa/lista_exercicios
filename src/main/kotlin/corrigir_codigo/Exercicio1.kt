package corrigir_codigo

fun converteParaDouble() {
    val entrada = readLine()

    val entradaDouble =
        entrada?.toDouble() // acrescentado ponto de interrogação na "entrada", para confirmar se o numero recebido pela redLine() não é nulo.

    println("Valor em decimal $entradaDouble")
}