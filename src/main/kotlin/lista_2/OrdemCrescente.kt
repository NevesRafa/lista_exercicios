package lista_2


class OrdemCrescente {

    fun ordemCrescente() {

        println("Digite 3 numeros e eu irei ordenar em ordem crescente!!!\n")

        var aux = 0
        println("Digite o 1° numero:")
        var num1 = readLine()?.toInt()
        println("Digite o 2° numero:")
        var num2 = readLine()?.toInt()
        println("Digite o 3° numero:")
        var num3 = readLine()?.toInt()

        var ouveTroca = true

        while (ouveTroca) {
            ouveTroca = false

            if (num1 != null && num2 != null && num3 != null) {


                if (num1 > num2) {
                    aux = num1
                    num1 = num2
                    num2 = aux
                    ouveTroca = true
                }

                if (num2 > num3) {
                    aux = num2
                    num2 = num3
                    num3 = aux
                    ouveTroca = true
                }
            }
        }

        println("-------------------------------------------------")
        println(num1)
        println(num2)
        println(num3)


    }

}