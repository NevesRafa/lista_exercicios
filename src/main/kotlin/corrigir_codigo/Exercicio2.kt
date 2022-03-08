package corrigir_codigo

fun menuPrincipal() {
    var opcao: String? = null

    // Feito a correçao da logica, estava invertido os botoes de ação...o botão 1 saia e o 0 continuava!
    while (opcao == null || opcao == "1") {
        println("Digite a opção desejada:\n[1] Continuar aqui.\n[0] Sair!")

        opcao = readLine()
    }

    println("Você saiu!!")
}