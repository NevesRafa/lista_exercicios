package lista_1

fun main() {

    verificaPalindromo()

}

fun verificaPalindromo() {

    println("Digite uma palavra e vou verificar para você se é um Palindromo ou não!")

    val palavra = readLine()?.toLowerCase()
    val palavraInversa = palavra?.reversed()

    if (palavra == palavraInversa) {
        println("A palavra digitada é um Palindromo")
    } else {
        println("A palavra digitada não é um Palindromo")
    }


}