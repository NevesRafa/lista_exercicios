package lista_2

class DivisaoZero() {

    fun DivisaoZero() {

        println("Digite o valor do dividedo:")
        val dividendo = readLine()?.toInt()
        println("Digete o valor do divisor:")
        val divisor = readLine()?.toInt()


        try {
            if (dividendo != null && divisor != null) {

                val calculo = dividendo / divisor

                println(calculo)

            }
        } catch (e: Exception) {
            println("Impossivel dividir por zero!")
        }


    }
}



