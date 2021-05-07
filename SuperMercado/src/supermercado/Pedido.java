package supermercado;

public class Pedido {
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    private Cliente cliente;
    private Item itens[] = new Item[10];
    private double valorTotal;
    private int i = 0;
    
    public void adicionarItem(Item item){
        this.itens[this.i] = item;
        this.valorTotal += item.getProduto().getPreco() * item.getQtdComprada();
        i++;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public Item[] getItens() {
        return itens;
    }  
    public int getI() {
        return i;
    }    
}
