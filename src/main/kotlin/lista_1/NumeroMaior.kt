package lista_1

fun main() {
    numeroMaior()
}

fun numeroMaior() {

    val num1 = 15
    val num2 = 5
    val num3 = 25
    var numMaior = num1

    if (num2 >= numMaior) {
        numMaior = num2
    }

    if (num3 >= numMaior) {
        numMaior = num3
    }


    println("O numero maior é $numMaior")
}