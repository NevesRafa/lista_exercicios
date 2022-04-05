package lista_2

class ContadorDeLetras {


    fun contadorLetra() {

        println("Digite um texto ou uma palavra que eu vou contar quantas letras contem para você!!!")
        val texto = readLine().toString()
        val listaPalavras = texto.split(" ")

        listaPalavras.forEach { it ->
            println(it.length)
        }
    }
}