package lista_1

fun main() {
    contador()
}

fun contador() {

    var valorInicial = 5

    println("--Para Incrementar [I]")
    println("--Para Zerar [Z]")
    println("--Para Retornar o valor [R]")
    println("--Para Sair [S]")
    println("---------------------------------------\n")


    var opcao: String? = null

    while (opcao != "S") {

        println("Valor do contador = $valorInicial\n")

        println("Digite uma opção:")

        opcao = readLine().toString()

        println("---------------------------------------")


        if (opcao == "I") {
            valorInicial++
        }
        if (opcao == "Z") {
            valorInicial = 0
        }
        if (opcao == "R") {
            valorInicial--
        }


    }
    println("Valor do contador = $valorInicial")
    println("Fim do Programa!!!")

}