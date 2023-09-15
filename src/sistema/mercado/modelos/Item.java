package sistema.mercado.modelos;

public class Item {

    // atributos :::
    private final String nome;
    private final double preco;
    private int quantidade;


    // construtor :::
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    //getters :::
    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public int getQuantidade() {
        return this.quantidade;
    }


    // métodos :::
    protected void removeQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f - Quantidade: %d", getNome(), getPreco(), getQuantidade());
    }
}

