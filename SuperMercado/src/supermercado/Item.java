package supermercado;

public class Item {
    public Item(Produto produto, int qtdComprada) {
        this.produto = produto;
        this.qtdComprada = qtdComprada;
        if (this.qtdComprada > this.produto.getQtdEstoque()) {
            this.qtdComprada = this.produto.getQtdEstoque();
        }
        this.produto.tirarEstoque(this.qtdComprada);
    }
    
    private Produto produto;
    private int qtdComprada;
    
    public Produto getProduto(){
        return this.produto;
    }
    public int getQtdComprada(){
        return this.qtdComprada;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public void setQtdComprada(int qtdComprada){
        this.qtdComprada = qtdComprada;
    }
}
