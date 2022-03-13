package lista_1

fun main() {
    numeroMaior()
}

fun numeroMaior() {

    var num1 = 10
    val num2 = 23
    var num3 = 8
    var numMaior = 0

    if (num1 > num2) {
        numMaior = num1
    }

    if (num2 > num3) {
        numMaior = num2
    }

    if (num3 > num1) {
        numMaior = num3
    }

    println("O numero maior é $numMaior")
}