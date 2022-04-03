package lista_2

class TipoDeTriangulo {

    fun leTriangulo() {

        println("Insira 3 valores e eu vou te dizer se é um triângulo e o seu tipo!")
        println("--------------------------------------------------------------------\n")
        println("Primeiro valor:")
        val ladoA = readLine()?.toDouble()
        println("Segundo valor:")
        val ladoB = readLine()?.toDouble()
        println("Terceiro valor:")
        val ladoC = readLine()?.toDouble()

        if (ladoA != null && ladoB != null && ladoC != null) {

            if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                if (ladoA == ladoB && ladoA == ladoC) {
                    println("Triângulo equilátero")
                } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                    println("Triângulo isósceles")
                } else {
                    println("Triângulo escaleno")
                }
            } else {
                println("Não forma um triângulo")
            }


        }
    }
}