package lista_1

fun main() {
    sucessor()
}

fun sucessor() {

    println("Digite um número:")

    var numero = readLine()?.toInt()
    numero = numero?.plus(1) // poderia ter usado if(numero != null){numero = numero + 1}
    println("$numero")

}