package lista_3

fun main() {
    calculaTroco()
}

fun calculaTroco() {

    println("Qual o valor do troco?")
    val valorTroco = readln().toInt()
    var troco = valorTroco
    val cinquentaCentavos = 50
    val vinteCincoCentavos = 25
    val dezCentavos = 10
    val cincoCentavos = 5
    val umCentavo = 1


    val moeda50 = (troco / cinquentaCentavos)
    troco -= moeda50 * cinquentaCentavos

    val moeda25 = (troco / vinteCincoCentavos)
    troco -= moeda25 * vinteCincoCentavos

    val moeda10 = (troco / dezCentavos)
    troco -= moeda10 * dezCentavos

    val moeda5 = (troco / cincoCentavos)
    troco -= moeda5 * cincoCentavos

    val moeda1 = (troco / umCentavo)


    println("Você vai precisar de $moeda50 moeda de 50 centavos")
    println("Você vai precisar de $moeda25 moeda de 25 centavos")
    println("Você vai precisar de $moeda10 moeda de 10 centavos")
    println("Você vai precisar de $moeda5 moeda de 5 centavos")
    println("Você vai precisar de $moeda1 moeda de 1 centavo")


}







