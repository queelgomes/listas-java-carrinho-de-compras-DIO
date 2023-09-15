package sistema.mercado.modelos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // atributos :::
    private List<Item> carrinho;

    // construtor ::
    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    // métodos :::
    public void adicionarItem(String nome, double preco, int quantidade) {
        int x = 0;
        if (carrinho.isEmpty()) {
            carrinho.add(new Item(nome, preco, quantidade));
        } else{
            for (Item i : carrinho){
                if (i.getNome().equalsIgnoreCase(nome)){
                    i.setQuantidade(quantidade);
                    x = 0;
                    break;
                } else{
                    x = 1;
                }
            }
            if (x == 1){
                carrinho.add(new Item(nome, preco, quantidade));
            }
        }
    }
    public void exibirItens(){
        for (Item i : carrinho){
            System.out.println(i);
        }
        System.out.println("-----------------------------------\n");
    }
    public void removerItem(String nome, int quantidade){
        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                if(i.getQuantidade() - quantidade == 0){
                    carrinho.remove(i);
                }
                else{
                    i.removeQuantidade(quantidade);
                }
            }
        }
    }
    public void calcularValorTotal(){
        double totalValor = 0;
        int totalQuantidade = 0;
        for(Item i : carrinho){
            totalValor += i.getValorTotal();
            totalQuantidade += i.getQuantidade();
        }

        System.out.println("\n::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::  RESUMO CARRINHO DE COMPRAS  ::::\n");
        System.out.println(">> Produtos adicionados no carrinho:");

        for(Item i : carrinho){
            System.out.println("     •" + i.getNome() + " " + i.getQuantidade());
        }
        System.out.printf(">> Valor total: R$%.2f\n", totalValor);
        System.out.printf(">> Quantidade de itens: %d", totalQuantidade);
        System.out.println("\n::::::::::::::::::::::::::::::::::::::");
    }


}