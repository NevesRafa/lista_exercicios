package lista_1

fun main() {

    inverteTexto()

}

fun inverteTexto() {

    println("Digite uma palavra ou um texto que deseja inverter:")

    val recebeTexto = readLine().toString()
    val iverteTexto = recebeTexto.reversed()

    println("-----------------------------------------")
    println("Pronto aqui está:\n $iverteTexto")
}