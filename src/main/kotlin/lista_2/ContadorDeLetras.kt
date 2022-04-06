package lista_2

class ContadorDeLetras {


    fun contadorLetra() {

        println("Digite um texto ou uma palavra que eu vou contar quantas letras contem para você!!!")
        val texto = readLine().toString()
        val listaPalavras = texto.split(" ")
        var contador = 0

        listaPalavras.forEach { it ->
            contador += it.length
        }

        println("Contem $contador letras!")


    }
}