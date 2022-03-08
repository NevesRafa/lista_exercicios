package corrigir_codigo

// Exercicio corrigido, o cod nao estava compilando pois estava sendo usado val quando deveria estar sendo usado var.

fun trocaDeValores() {
    var num1 = 20
    var num2 = 50
    var aux = 0

    aux = num1
    num1 = num2
    num2 = aux
}