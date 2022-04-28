package lista_3

import java.text.Normalizer
import java.util.regex.Pattern


fun main() {
    Forca().jogoDaForca()
}

class Forca() {


    val listaPalavras = listOf(
        "Amarelo",
        "Amiga",
        "Amor",
        "Ave",
        "Avião",
        "Avó",
        "Balão",
        "Bebê",
        "Bolo",
        "Branco",
        "Cama",
        "Caneca",
        "Celular",
        "Clube",
        "Copo",
        "Doce",
        "Elefante",
        "Escola",
        "Estojo",
        "Faca",
        "Foto",
        "Garfo",
        "Geleia",
        "Girafa",
        "Janela",
        "Limonada",
        "Mãe",
        "Meia",
        "Noite",
        "Óculos",
        "ônibus",
        "Ovo",
        "Pai",
        "Pão",
        "Parque",
        "Passarinho",
        "Peixe",
        "Pijama",
        "Rato",
        "Umbigo"
    )
    var chance = 3
    var escondePalavra = "_"
    val listaChutes: MutableList<String> = mutableListOf()
    lateinit var palavraPreenchida: MutableList<String>


    fun deAccent(str: String): String? {
        val nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD)
        val pattern: Pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}")
        return pattern.matcher(nfdNormalizedString).replaceAll("")
    }


    fun jogoDaForca() {

        val palavraSorteada = listaPalavras.random().uppercase()
        palavraPreenchida = MutableList(palavraSorteada.length) { "" }

        println(palavraSorteada)
        println(palavraPreenchida)


        val palavraPreenchidaJunta = palavraPreenchida.joinToString(separator = "")


        while (true) {

            println("\nChute uma letra!")
            val chuteUsuario = readLine().toString().uppercase()

            if (palavraSorteada.contains(chuteUsuario)) {
                listaChutes.add(chuteUsuario)
                verificaLetra(palavraSorteada, chuteUsuario)
                println(listaChutes)
            } else {
                chance -= 1
                println("A letra $chuteUsuario não contém na palavra, você tem ainda $chance...Boa sorte!")
            }
            if (chance <= 0) {
                println("Acabou sua chance!!")
                break
            } else if (palavraPreenchidaJunta == palavraSorteada) {
                println("Parabens voce acertou a palavra!!")
                break
            }
        }
    }

    fun verificaLetra(palavraSorteada: String, chuteUsuario: String) {

        palavraSorteada.forEachIndexed { posicao, letra ->

            if (chuteUsuario[0] == letra) {
                palavraPreenchida.add(posicao, letra.toString())

            } else if (chuteUsuario[0] != letra) {
                print(escondePalavra)
            }
        }
    }
}






