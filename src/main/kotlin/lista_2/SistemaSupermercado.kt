package lista_2

import java.text.DecimalFormat

fun main() {
    SistemaSupermercado().executa()
}

class SistemaSupermercado() {

    val listaEstoque = listOf<Produto>(
        Produto("Banana", 2.0, 10),
        Produto("Refrigerante", 5.00, 0),
        Produto("Arroz", 15.00, 40),
        Produto("Feijão", 7.00, 80),
        Produto("Carne", 30.00, 50)
    )

    val carrinho = mutableListOf<ItemCarrinho>()
    var total = 0.0

    fun executa() {

        println("Bem vindo(a) ao mercadinho Neves!!!")
        println("------------------------------------")

        var entrada: String? = null

        while (entrada != "S") {

            println(
                "\nPorfavor escolha uma opção:\n\n[S]  -->  Para sair\n[M]  -->  Continuar comprando\n[C]  -->  Carrinho\n" +
                        "[P]  -->  Pagamento"
            )
            entrada = readLine()?.uppercase()

            if (entrada == "M") {
                fazerCompra()
            }
            if (entrada == "C") {
                carrinho()
            }
            if (entrada == "P") {
                pagamento()
                return
            }
            if (entrada == "S") {
                return
            }
        }
    }

    fun fazerCompra() {

        println("Escolha o produto que deseja:\n")

        listaEstoque.forEachIndexed { index, produto ->
            println("[$index]  -->  ${produto.nome}  -->  R$${produto.preco}  -->  ${produto.estoque}")
        }

        val produtoSelecionado = readLine()?.toInt()

        println("Qual quantidade você deseja?\n")
        val entradaQtd = readLine()?.toInt()

        if (produtoSelecionado == null || entradaQtd == null) {
            return
        }

        realizaCompra(produtoSelecionado, entradaQtd)
    }

    fun realizaCompra(
        produtoSelecionado: Int,
        entradaQtd: Int
    ) {

        val estoqueDoProduto = listaEstoque[produtoSelecionado].estoque

        if (estoqueDoProduto <= 0) {
            println("Desculpa produto sem estoque no momento.")
            return
        }

        if (entradaQtd > estoqueDoProduto) {
            println("Desculpe não temos toda essa quantidade em estoque!")
            println("A quantidade disponivel em estoque é de $estoqueDoProduto unidades")
            println("Porfavor retorne ao menu de compra e execute sua compra novamente com a quantidade deseja!\nObrigado!")
            return
        }

        carrinho.add(ItemCarrinho(listaEstoque[produtoSelecionado], entradaQtd))
        listaEstoque[produtoSelecionado].estoque -= entradaQtd
        total += listaEstoque[produtoSelecionado].preco * entradaQtd
        println("Compra executada com sucesso!\n$entradaQtd unidades foram adicionadas ao seu carrinho!\nObigado!")
    }

    fun carrinho() {

        println("Itens escolhidos ate o momento\n")
        carrinho.forEach { itemCarrinho ->
            println("${itemCarrinho.produto.nome}  -->  R$${itemCarrinho.produto.preco}  -->  ${itemCarrinho.quantidade}")
        }
        println("\nO total da compra é R$$total")
    }

    fun pagamento() {

        println("O valor total da compra é de $total\n")
        println("Porfavor selecione uma forma de pagamento:\n\n[D]  -->  Dinheiro 10% de desconto\n[C]  -->  Cartão acrescimo de 10%\n[P]  -->  Pix valor normal\n")

        val dinheiro = total * 0.9
        val cartao = total * 1.1
        val pix = total
        val formaDePagamento = readLine()?.uppercase()
        val decimal = DecimalFormat("#.##")

        if (formaDePagamento == "D") {
            println("Forma de pagamento dinheiro,  pagamento no valor de R$${decimal.format(dinheiro)} efetuado!!!\nObrigado, volte sempre!!!")
            return
        }
        if (formaDePagamento == "C") {
            println("Forma de pagamento cartão,  pagamento no valor de R$${decimal.format(cartao)} efetuado!!!\nObrigado, volte sempre!!!")
            return
        }
        if (formaDePagamento == "P") {
            println("Forma de pagamento pix, pagamento no valor de R$${decimal.format(pix)} efetuado!!!\nObrigado, volte sempre!!!")
            return
        }


    }

}

class Produto(
    val nome: String,
    var preco: Double,
    var estoque: Int
)

class ItemCarrinho(
    val produto: Produto,
    val quantidade: Int
)












