package lista_2

class CalculoFatorial {
    fun calculadoraFatorial() {

        println("Digite um numero inteiro para calcularmos o fatorial dele:")
        val num = readLine()?.toInt()
        var i = 1
        var fatorial: Long = 1

        if (num != null) {
            while (i <= num) {
                fatorial *= i.toLong()
                i++
            }
        }

        println("O fatorial de $num é $fatorial")

    }
}