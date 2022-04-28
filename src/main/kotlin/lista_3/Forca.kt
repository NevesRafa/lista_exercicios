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
    val listaChutes: MutableList<String> = mutableListOf()
    lateinit var palavraPreenchida: MutableList<String>


    fun deAccent(str: String): String? {
        val nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD)
        val pattern: Pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}")
        return pattern.matcher(nfdNormalizedString).replaceAll("")
    }


    fun jogoDaForca() {

        val palavraSorteada = listaPalavras.random().uppercase()
        val palavraSemAcento = deAccent(palavraSorteada)
        palavraPreenchida = MutableList(palavraSorteada.length) { "" }

        while (true) {

            println("Seus chutes ate agora foram $listaChutes\n")
            println("\nChute uma letra!")
            val chuteUsuario = readLine().toString().uppercase()
            listaChutes.add(chuteUsuario)

            if (palavraSemAcento != null) {
                if (palavraSemAcento.contains(chuteUsuario)) {
                    verificaLetra(palavraSemAcento, chuteUsuario)
                    println(palavraPreenchida)
                } else {
                    chance -= 1
                    println("A letra $chuteUsuario não contém na palavra, você tem ainda $chance...Boa sorte!")
                }
            }

            val palavraPreenchidaJunta = palavraPreenchida.joinToString(separator = "")
            if (chance <= 0) {
                println("Aaaa você perdeu, acabaram suas chances...a palavra era $palavraSorteada")
                break
            } else if (palavraPreenchidaJunta == palavraSemAcento) {
                println("Parabens voce acertou a palavra!!")
                break
            }
        }


    }

    fun verificaLetra(palavraSemAcento: String, chuteUsuario: String) {

        palavraSemAcento.forEachIndexed { posicao, letra ->

            if (chuteUsuario[0] == letra) {
                palavraPreenchida.set(posicao, letra.toString())
            }
        }
    }
}





