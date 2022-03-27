fun main() {

    try {
        // faz aqui o seu código
    } catch (erro: Exception) {
        // se der algum erro tipo dividir por zero
        // ele entra nesse bloco

        // aí esse objeto "erro" que mostra na linha 5
        // tem os detalhes do erro que ele "pegou"
        // da pra fazer um print disso

        println("o erro que aconteceu foi: ${erro.message}")
    }

}