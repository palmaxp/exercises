package supermercado;

public class Pedido {    
    private Cliente cliente;
    private Produto[] produtos = new Produto[10];
    
    private int qtdProduto = 0;
    public Cliente getCliente() {
        return cliente;
    }
    
    public void adicionarProduto(Produto produto){
        this.produtos[qtdProduto] = produto;
        qtdProduto++;
    }    
}
