package supermercado;

public class Produto {
    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    
    private String nome;
    private double preco;
    private int qtdEstoque;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public int tirarEstoque(int quantidade){
        this.qtdEstoque -= quantidade;
        return this.qtdEstoque;
    }    
}
