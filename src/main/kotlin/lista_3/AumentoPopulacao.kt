package lista_3

fun main() {
    AumentoPopulacao().calculaPopulaçao()
}

class AumentoPopulacao {


    var popA = 80000 // populacao pais A
    val popACrescimento = 1.03 // 3% ao ano
    var popB = 200000 // populacao pais B
    val popBCrescimento = 1.015 // 1.5% ao ano
    var anos = 0  // contador de anos
    var superou = ""

    fun calculaPopulaçao() {


        while (true) {

            popA = (popA * popACrescimento).toInt() // calculo populacao + cresciemento anual
            popB = (popB * popBCrescimento).toInt() // calculo populacao + cresciemento anual

            if (popA > popB) {
                superou = "o pais A superou a população do pais B"
                break
            }
            if (popA == popB) {
                superou = "o pais A igualou a população do pais B"
            }
            anos++
        }
        println("Após $anos anos,$superou com  com um crescimento populacional de 3% a.a e o pais B com 1.5% a.a")
        println("Pais A população Atual = $popA")
        println("Pais B população Atual = $popB")
    }
}