package lista_2

fun main() {
    ConverteParaAncronimo().converteAncronimo()
}


class ConverteParaAncronimo {

    fun converteAncronimo() {

        println("Digite seu nome completo que transformarei em Ancronimo!!!")

        val nomeCompleto = readLine().toString()

        val listaNomes = nomeCompleto.split(" ")


        listaNomes.forEach { nome ->
            println(nome[0])
        }


    }


}