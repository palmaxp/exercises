package supermercado;

public class Produto {
    public Produto(String nome, double preco, int qntEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }    
    private String nome;
    private double preco;
    private int qntEstoque;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQntEstoque() {
        return qntEstoque;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }    
}
