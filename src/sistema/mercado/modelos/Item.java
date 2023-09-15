package sistema.mercado.modelos;

public class Item {

    // atributos :::
    private final String nome;
    private final double preco;
    private int quantidade;
    private double valorTotal;


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

    // setters :::
    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    // métodos :::
    protected void removeQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double getValorTotal() {
        this.valorTotal = quantidade * preco;
        return this.valorTotal;
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f - Quantidade: %d", getNome(), getPreco(), getQuantidade());
    }
}

