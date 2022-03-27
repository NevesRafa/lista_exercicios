package lista_1

fun main() {

    calculadora()

}

fun calculadora() {


    var entrada: String? = null

    while (entrada != "S") {

        println("-----------------------------------------")
        println("Digite um numero que deseja calcular:")
        val num1 = readLine()?.toDouble()

        println("-----------------------------------------")
        println("Digite um numero que deseja calcular:")
        val num2 = readLine()?.toDouble()

        if (num1 != null && num2 != null) {

            if (num1 == num2) {
                println("-----------------------------------------")
                println("Os numeros digitados são iguais = $num1 & $num2!\n")
            } else if (num1 > num2) {
                println("-----------------------------------------")
                println("O numero maior da equação é o primeiro numero digitado = $num1\n")
            } else {
                println("-----------------------------------------")
                println("O numero maior da equação é o segundo numero digitado = $num2\n")
            }


            val soma = num1 + num2
            val subtracao = num1 - num2
            val multiplicacao = num1 * num2
            val divisao = num1 / num2


            println("-----------------------------------------")
            println("Para somar digite [+]")
            println("Para subtrair digite [-]")
            println("Para multiplicar digite [*]")
            println("Para dividir digite [/]")
            println("-----------------------------------------")

            println("Digite a operação desejada:")
            entrada = readLine().toString()


            when {
                entrada == "+" -> println("$num1 + $num2 = $soma\n")
                entrada == "-" -> println("$num1 - $num2 = $subtracao\n")
                entrada == "*" -> println("$num1 x $num2 = $multiplicacao\n")
                entrada == "/" -> println("$num1 / $num2 = $divisao\n")


            }

        }


    }


}
