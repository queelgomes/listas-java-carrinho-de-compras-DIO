package sistema.mercado.principal;

import sistema.mercado.modelos.CarrinhoDeCompras;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras meucarrinho = new CarrinhoDeCompras();

        meucarrinho.adicionarItem("Chocolate", 3.90, 1);
        meucarrinho.adicionarItem("Caneta", 1.20, 1);
        meucarrinho.adicionarItem("Bolo", 23.50, 1);
        meucarrinho.adicionarItem("Caneta", 1.20, 1);
        meucarrinho.adicionarItem("Bolo", 23.50, 1);

        meucarrinho.exibirItens();

        meucarrinho.removerItem("Caneta", 2);

        meucarrinho.calcularValorTotal();

    }
}
