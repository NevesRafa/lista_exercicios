package lista_1

fun main() {
    divisaoEResto()
}

fun divisaoEResto() {

    println("Digite um dividendo:")

    var dividendo = readLine()?.toInt()

    println("Digite um divisor:")

    var divisor = readLine()?.toInt()

    if (dividendo != null && divisor != null) {
        val quociente = dividendo / divisor
        val resto = dividendo % divisor

        println("O quociente da divisão entre $dividendo:$divisor é $quociente")
        println("O resto da divisão entre $dividendo:$divisor é $resto")
    }


}