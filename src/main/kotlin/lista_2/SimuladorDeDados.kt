package lista_2
fun main() {
    SimuladorDeDados().simuladorDados()
}
class SimuladorDeDados {
    fun simuladorDados() {

        var face1 = 0
        var face2 = 0
        var face3 = 0
        var face4 = 0
        var face5 = 0
        var face6 = 0


        repeat(100) {

            when ((1..6).random()) {
                1 -> face1++
                2 -> face2++
                3 -> face3++
                4 -> face4++
                5 -> face5++
                6 -> face6++
            }

        }
        println("Foi sorteado 100 vezes um dado de 6 lados e esses são os valores coletados\nPorcentagem referente a quantidades de vezes que o lado foi sorteado.")
        println("----------------------------------------------------------------------------")
        println("[1]-$face1%\n[2]-$face2%\n[3]-$face3%\n[4]-$face4%\n[5]-$face5%\n[6]-$face6%")

    }


}