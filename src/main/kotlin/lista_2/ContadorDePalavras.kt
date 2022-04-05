package lista_2

class ContadorDePalavras {

    fun contadorPalavras() {

        println("Digite um texto e irei contar contas palavras contem nele!!!")
        val texto = readLine().toString()
        val listaPalavra = texto.split(" ")

        println(listaPalavra.count())

    }
}